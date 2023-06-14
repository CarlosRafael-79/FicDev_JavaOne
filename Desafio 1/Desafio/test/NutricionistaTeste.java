import desafio.model.Nutricionista;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class NutricionistaTeste {
    
    @Test
    public static void meuTeste(){
        Nutricionista nutri = new Nutricionista("Carlos Rafael", "1234", "MT");
        String nome = "Carlos Rafael";
        String crn = "1234";
        String uf = "MT";
        
        assertTrue(nome.equals(nutri.getNome()));
        assertTrue(crn.equals(nutri.getCrn()));
        assertTrue(uf.equals(nutri.getUf()));
    }
    
    public static void main(String[] args) {
        meuTeste();
    }
}
