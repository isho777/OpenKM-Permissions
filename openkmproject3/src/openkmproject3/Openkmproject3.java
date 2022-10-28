
package openkmproject3;

import com.openkm.sdk4j.bean.Permission;

public class Openkmproject3 {
    public static void main(String[] args) {                    
	System.out.println("Permission read..."+Permission.READ);
        System.out.println("Permission write..."+Permission.WRITE);
        System.out.println("Permission read+write..."+ (Permission.READ+Permission.WRITE)  );
        System.out.println("Permission all..."+Permission.ALL_GRANTS);
        System.out.println("Permission delete..."+Permission.DELETE);
        System.out.println("Permission download..."+Permission.DOWNLOAD);
        System.out.println("Permission move..."+Permission.MOVE);
        System.out.println("Permission none..."+Permission.NONE);        
        
        /*
        Will print the following...
        
        Permission read...1
        Permission write...2
        Permission read+write...3
        Permission all...15
        Permission delete...4
        Permission download...1024
        Permission move...16
        Permission none...0
        */
        
        // JAR FILE sdk4j-with-dependences-1.2.jar  is in the main project folder
        // Add jar file to project class path before use
        
        
    }    
}
