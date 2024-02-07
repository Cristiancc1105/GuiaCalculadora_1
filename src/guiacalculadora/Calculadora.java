package GuiaCalculadora;

public class Calculadora {
    
    public double num1,num2,result,Result,coseno,seno,tangente,raiz,porcentaje,iva,total;
    
    public void suma(){
        result=num1+num2;
    }
    
    public void resta(){
        result=num1-num2;
    }
    
    public void multiplicacion(){
        result=num1*num2;
    }
    
    public void division(){
        if(num2 !=0){
            result=num1/num2;
        }
        else{
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
    
    public void seno(double a){
        seno=Math.sin(Math.toRadians(a));
    }
    
    public void coseno(double a){
        coseno=Math.cos(Math.toRadians(a));
    }
    
    public void tangente(double a){
        tangente=Math.tan(Math.toRadians(a));
    }
    
    public void raizEnesima(double a){
        result=Math.pow(num1,1/num2);
    }
    
    public void potenciaEnesima(){
        result=Math.pow(num1,num2);
    }
    
    public void CIVA(){
        porcentaje=num2*0.01;
        iva=num1*porcentaje;
        total=num1+iva;
    }
}
