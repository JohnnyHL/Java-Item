package com.hl.magic.dpattern.dp2factory.demo01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class ClassUtils {
    public static List<Class>  getAllClassByInterface(Class c) {
        List<Class> returnClassList = new ArrayList<>();
        if (c.isInterface()) {
            String packageName = c.getPackage().getName();
            try {
                List<Class> allClass = getClasses(packageName);
                for (int i = 0; i < allClass.size(); i++) {
                    if (c.isAssignableFrom(allClass.get(i))) {
                        if (!c.equals(allClass.get(i))) {
                            returnClassList.add(allClass.get(i));
                        }
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return returnClassList;
    }
    private static List<Class> getClasses(String packageName)
            throws ClassNotFoundException,IOException{
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.','/');
        return null;
    }
}
