
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Sep 22 13:47:26 CST 2020
//----------------------------------------------------

package tac_assembly_generator.languages.analyzers.syntax;

import java_cup.runtime.Symbol;
import java.util.ArrayList;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Sep 22 13:47:26 CST 2020
  */
public class SyntaxMlgAnalyzer extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public SyntaxMlgAnalyzer() {super();}

  /** Constructor which sets the default scanner. */
  public SyntaxMlgAnalyzer(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SyntaxMlgAnalyzer(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\003\000\002\002\004\000\002\002\012\000\002\002" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\006\003\004\004\005\001\002\000\004\002" +
    "\uffff\001\002\000\004\015\010\001\002\000\004\002\007" +
    "\001\002\000\004\002\001\001\002\000\004\022\011\001" +
    "\002\000\004\006\012\001\002\000\004\015\013\001\002" +
    "\000\004\016\014\001\002\000\004\015\015\001\002\000" +
    "\004\024\016\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\004\002\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SyntaxMlgAnalyzer$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SyntaxMlgAnalyzer$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$SyntaxMlgAnalyzer$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    

    public boolean error;
    public boolean errorRecuperable;

     public void syntax_error(Symbol s){
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        System.out.println("Error Sintactico Recuperado\n");
        System.out.println("\t \tLexema: "+ lexema+"\n");
        System.out.println("\t \tFila: "+ fila+"\n");
        System.out.println("\t \tColumna: "+ columna+"\n");

    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        try{
            String lexema = s.value.toString();
            int fila = s.right;
            int columna = s.left;
        System.out.println("Error Sintactico Recuperado\n");
        System.out.println("\t \tLexema: "+ lexema+"\n");
        System.out.println("\t \tFila: "+ fila+"\n");
        System.out.println("\t \tColumna: "+ columna+"\n");

        } catch (Exception ex) {
            
         }
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$SyntaxMlgAnalyzer$actions {
  private final SyntaxMlgAnalyzer parser;

  /** Constructor */
  CUP$SyntaxMlgAnalyzer$actions(SyntaxMlgAnalyzer parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$SyntaxMlgAnalyzer$do_action(
    int                        CUP$SyntaxMlgAnalyzer$act_num,
    java_cup.runtime.lr_parser CUP$SyntaxMlgAnalyzer$parser,
    java.util.Stack            CUP$SyntaxMlgAnalyzer$stack,
    int                        CUP$SyntaxMlgAnalyzer$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SyntaxMlgAnalyzer$result;

      /* select the action based on the action number */
      switch (CUP$SyntaxMlgAnalyzer$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= error 
            {
              Object RESULT =null;

              CUP$SyntaxMlgAnalyzer$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$SyntaxMlgAnalyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntaxMlgAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxMlgAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= VB_SEPERATOR LINE_BREAK DIM_VB EQUAL LINE_BREAK JAVA_SEPERATOR LINE_BREAK INTEGER_TYPE_J 
            {
              Object RESULT =null;

              CUP$SyntaxMlgAnalyzer$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$SyntaxMlgAnalyzer$stack.elementAt(CUP$SyntaxMlgAnalyzer$top-7)), ((java_cup.runtime.Symbol)CUP$SyntaxMlgAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntaxMlgAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SyntaxMlgAnalyzer$stack.elementAt(CUP$SyntaxMlgAnalyzer$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SyntaxMlgAnalyzer$stack.elementAt(CUP$SyntaxMlgAnalyzer$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$SyntaxMlgAnalyzer$stack.elementAt(CUP$SyntaxMlgAnalyzer$top-1)).value;
		RESULT = start_val;
              CUP$SyntaxMlgAnalyzer$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SyntaxMlgAnalyzer$stack.elementAt(CUP$SyntaxMlgAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntaxMlgAnalyzer$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SyntaxMlgAnalyzer$parser.done_parsing();
          return CUP$SyntaxMlgAnalyzer$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

