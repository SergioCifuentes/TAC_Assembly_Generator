/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tac_assembly_generator.languages.semantic;

import java.util.ArrayList;

/**
 *
 * @author sergio
 */
public class SymbolTable {
    private ArrayList<Tuple> symbols;

    public SymbolTable() {
        symbols= new ArrayList<>();
    }
    
    public void insertTuple(Tuple tuple){
        symbols.add(tuple);
    }
    
    
}
