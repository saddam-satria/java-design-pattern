package Injection;


public class DependencyInjectionImpl{
    private final DependencyInjection injection;
    public DependencyInjectionImpl( DependencyInjection injection){
        this.injection = injection;
    }
    public String getName(){
        return this.injection.getName();
    }
}