package annotationAssignment;
import java.lang.annotation.*;
import java.lang.annotation.Inherited;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

@Inherited
@Documented
@Target(ElementType.METHOD) 
@Retention(RetentionPolicy.RUNTIME)
  
 

@interface Execute {
    int Sequence();
}

class MyClass{ 

@Execute(Sequence=2)

public void myMethod1(){
	System.out.println("The priority of mymethod1 is:2");
}

@Execute(Sequence=1)

public void myMethod2(){
	System.out.println("The priority of mymethod2 is:1");
}

@Execute(Sequence=3)

public void myMethod3(){
	System.out.println("The priority of mymethod3 is:3");
}

}


public class ExecuteAssignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyClass h = new MyClass();
		Class c =h.getClass();
		Method[] methods = MyClass.class.getMethods();
		System.out.println("Sequential Order");
		  Arrays.sort(methods, new Comparator<Method>() {
	            @Override
	            public int compare(Method o1, Method o2) {
	                Execute or1 = o1.getAnnotation(Execute.class);
	                Execute or2 = o2.getAnnotation(Execute.class);
	                // nulls last
	                if (or1 != null && or2 != null) {
	                    return or1.Sequence() - or2.Sequence();
	                } 
	                else if (or1 != null && or2 == null) {
	                    return -1;
	                } 
	                else if (or1 == null && or2 != null) {
	                    return 1;
	                }
	                return o1.getName().compareTo(o2.getName());
	            }
	        });
	        for (Method m : methods) {
	        	if(m.isAnnotationPresent(Execute.class))
	            System.out.println(m.getName());
	        }
	    
		
		
		System.out.println("Any Order");
		for(Method m:c.getMethods())
		{
			//System.out.println(m);
			if(m.isAnnotationPresent(Execute.class))
			{
				Execute e=m.getAnnotation(Execute.class);
				System.out.println(e.Sequence());
			}
		}
	}

}
