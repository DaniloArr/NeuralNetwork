package danilo.neuralnetwork;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double[] inputValue = {0, 1};        
        double[] weightValue = {0.5, 0.5};
        
        double bias = 0.5; // tendencia
        
        double sum = 0.0;
        
        for(int i = 0; i < inputValue.length; i++) {
        	sum += inputValue[i] * weightValue[i];
        }
        
        sum += bias;
        
        double a = sum > 0 ? 1.0 : 0.0;
        
        System.out.println(a);
    }
}
