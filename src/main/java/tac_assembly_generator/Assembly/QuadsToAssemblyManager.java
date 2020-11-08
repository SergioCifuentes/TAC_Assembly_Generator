/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tac_assembly_generator.Assembly;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tac_assembly_generator.TAC.quadruple.Operation;
import tac_assembly_generator.TAC.quadruple.Quadruple;
import tac_assembly_generator.languages.ResultQuads;
import tac_assembly_generator.optimized.HtmlCreator;

/**
 *
 * @author sergio
 */
public class QuadsToAssemblyManager {
    
    private ResultQuads resultQuads;
    private String fileName;
    private final static String DIRECTORY_NAME = "Executable";
    private AssemblyObject assemblyObject;
    private boolean currentMain;
    
    public QuadsToAssemblyManager(ResultQuads resultQuads, String fileName) {
        this.resultQuads = resultQuads;
        this.fileName = fileName;
        assemblyObject = new AssemblyObject();
        
        currentMain = false;
    }
    
    public void translate() {
        for (int i = 0; i < resultQuads.getQuadruples().size(); i++) {
            
            if (resultQuads.getQuadruples().get(i).getClass().equals(Quadruple.class)) {
                Quadruple quad = (Quadruple) resultQuads.getQuadruples().get(i);
                if (quad.getOp()==null) {
                    
                }else if (quad.getOp() == Operation.PRINT) {
                    System.out.println(quad);
                    if (((String) quad.getResult()).startsWith("\"")) {
                        String stringData = assemblyObject.getDataSection().createDB((String) quad.getResult());
                        assemblyObject.getTextSection().createPrint(stringData);
                    }
                } else if (quad.getOp() == Operation.FUNCTION) {
                    if (quad.getResult().equals("}")) {
                        if (currentMain) {
                            assemblyObject.getTextSection().closeStart();
                            currentMain = false;
                        } else {
                            assemblyObject.getTextSection().closeLabel();
                        }
                    } else if (quad.getResult().contains("main")) {
                        assemblyObject.getTextSection().startLabel();
                        currentMain=true;
                    }else {
                        String function = quad.getResult().replace("(){","");
                        function=function.replace("void", "");
                        function=function.replace(" ", "");
                        assemblyObject.getTextSection().openLable(function);
                    }
                    
                }
                
            }
        }
        createAsmFile(assemblyObject.toString());
    }
    
    public void createAsmFile(String output) {
        File folder = new File("./" + DIRECTORY_NAME);
        
        if (!folder.exists() || !folder.isDirectory()) {
            folder.mkdir();
            folder.mkdirs();
            try {
                folder.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(HtmlCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        File file = new File(folder.getPath() + "/" + fileName.replace(".mlg", ".asm"));
        System.out.println(file.getPath());
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(HtmlCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(output);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(QuadsToAssemblyManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}