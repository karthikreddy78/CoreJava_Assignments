package annotationAssignment;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int    authorId();
    String synopsis();
    String engineer() default "[unassigned]"; 
    String date()    default "[unimplemented]"; 
   
}

public class DeveloperAssignment {

}
