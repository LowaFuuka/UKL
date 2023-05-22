
package ukl2;

public class inheritance extends Masyarakat {
    public void login(int inp){
           System.out.println("\n==========     Login Data Client        ==========\n");
               System.out.println("Nama Client\t: " + super.getNama(inp) +
                       "\nAlamat\t:"+ super.getAlamat(inp) +
                       "\nContact\t:" + super.getTelepon(inp) +                   
                       "\n-----");
        }
    }

