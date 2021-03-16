package designPatterns.pattern01singleton.singleOnClusterEnvironment;

/**
 * Created by chenjinxin on 2021/3/16 下午5:50
 */
public class SharedObjectStorage {
    public IdGenerator load(Class<IdGenerator> idGeneratorClass) throws IllegalAccessException, InstantiationException {
        return idGeneratorClass.newInstance();
    }

    public void save(IdGenerator idGenerator, Class<IdGenerator> idGeneratorClass) {
    }
}
