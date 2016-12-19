package dotWheyIntepretador.parser;

import java.util.ArrayList;
import org.antlr.v4.runtime.TokenStream;

public class DotWheyIntepretadorParserConsole extends DotWheyIntepretadorParser {

    private final ArrayList<Symbol> table;

    public DotWheyIntepretadorParserConsole(TokenStream input) {
        super(input);
        table = new ArrayList<>();
    }

    @Override
    void add(String var, Object value) {
        for (Symbol s : table) {
            if (s.getVar().equals(var)) {
                s.setValue(value);
                return;
            }
        }
        Symbol symbol = new Symbol();
        symbol.setValue(value);
        symbol.setVar(var);
        table.add(symbol);
    }

    @Override
    void print(String str) {
        String[] val = str.split("\"");
        System.out.print(val[1] + " ");

    }

    @Override
    void printAll(String str) {
        Symbol s = null;
        for (Symbol aux : table) {
            if (aux.getVar().equals(str)) {
                s = aux;
            }
        }
        if (s != null) {
            if (s.getValue() instanceof String) {
                System.out.println((String) s.getValue());
            } else if (s.getValue() instanceof Float) {
                System.out.println((Float) s.getValue());
            } else if (s.getValue() instanceof Integer) {
                System.out.println((Integer) s.getValue());
            } else if (s.getValue() instanceof Boolean) {
                System.out.println((Boolean) s.getValue());
            }
        } else {
            System.out.println("Variável " + str + " não declarada.");
        }
    }

    @Override
    void readInt(String str) {
        Symbol s = null;
        for (Symbol aux : table) {
            if (aux.getVar().equals(str)) {
                s = aux;
            }
        }
        if (s != null) {
            if (s.getValue() instanceof Integer) {
                s.setValue(tec.nextInt());
            } else {
                System.out.println("Não é possível converter " + str + " para inteiro.");
            }
        } else {
            System.out.println("Variável " + str + " não foi declarada.");
        }
    }

    @Override
    void readStr(String str) {
        Symbol s = null;
        for (Symbol aux : table) {
            if (aux.getVar().equals(str)) {
                s = aux;
            }
        }
        if (s != null) {
            if (s.getValue() instanceof String) {
                s.setValue(tec.nextLine());
            } else {
                System.out.println("Não é possível converter " + str + " para string.");
            }
        } else {
            System.out.println("Variável " + str + " não foi declarada.");
        }
    }

    @Override
    void readFloat(String str) {
        Symbol s = null;
        for (Symbol aux : table) {
            if (aux.getVar().equals(str)) {
                s = aux;
            }
        }
        if (s != null) {
            if (s.getValue() instanceof Float) {
                s.setValue(tec.nextFloat());
            } else {
                System.out.println("Não é possível converter " + str + " para float.");
            }
        } else {
            System.out.println("Variável " + str + " não foi declarada.");
        }
    }

    @Override
    void readBool(String str) {
        Symbol s = null;
        for (Symbol aux : table) {
            if (aux.getVar().equals(str)) {
                s = aux;
            }
        }
        if (s != null) {
            if (s.getValue() instanceof Boolean) {
                s.setValue(tec.nextBoolean());
            } else {
                System.out.println("Não é possível converter " + str + " para boolean.");
            }
        } else {
            System.out.println("Variável " + str + " não foi declarada.");
        }
    }

    @Override
    Integer getInt(String str) {
        Symbol s = null;
        for (Symbol aux : table) {
            if (aux.getVar().equals(str)) {
                s = aux;
            }
        }
        if (s != null) {
            if (s.getValue() instanceof Integer) {
                return (Integer) s.getValue();
            } else {
                System.out.println("Não é possível converter " + str + " para boolean.");
                return null;
            }
        } else {
            System.out.println("Variavel " + str + " não foi declarada.");
            return null;
        }
    }

}
