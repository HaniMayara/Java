package bean;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

public class BeanInfos{
    public static void main(String[] args) {
        try {
            BeanInfo bi = Introspector.getBeanInfo(CompteurBean2.class);
            BeanDescriptor unBeanDescriptor = bi.getBeanDescriptor();
            System.out.println("Nom du bean : " + unBeanDescriptor.getName());
            System.out.println("Classe du bean : " + unBeanDescriptor.getBeanClass());


            System.out.println("2eme methode");
            MethodDescriptor[] methodDescriptor = bi.getMethodDescriptors();
            for (int i = 0; i < methodDescriptor.length; i++) {
                System.out.println(" Methode : " + methodDescriptor[i].getName());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
