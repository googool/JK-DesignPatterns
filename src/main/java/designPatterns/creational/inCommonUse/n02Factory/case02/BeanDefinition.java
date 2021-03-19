package designPatterns.creational.inCommonUse.n02Factory.case02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/17 下午2:04
 */
public class BeanDefinition {
    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;
    // 省略必要的getter/setter/constructors

    public boolean isSingleton() {
        return scope.equals(Scope.SINGLETON);
    }

    public String getId() {
        return "";
    }

    public boolean isLazyInit() {
        return true;
    }

    public String getClassName() {
        return null;
    }

    public List<ConstructorArg> getConstructorArgs() {
        return null;
    }


    public static enum Scope {
        SINGLETON,
        PROTOTYPE
    }

    public static class ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg;

        public boolean getIsRef() {
            return false;
        }

        public Class getType() {
            return null;
        }

        public String getArg() {
            return null;
        }
        // 省略必要的getter/setter/constructors
    }
}
