package designPatterns.pattern02Factory.case02;

import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by chenjinxin on 2021/3/17 下午2:04
 */
public class BeanConfigParser {

    List<BeanDefinition> parse(String configContent) {
        return null;
    }

    public List<BeanDefinition> parse(InputStream in) {
        return new List<BeanDefinition>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<BeanDefinition> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(BeanDefinition beanDefinition) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends BeanDefinition> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends BeanDefinition> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public BeanDefinition get(int index) {
                return null;
            }

            @Override
            public BeanDefinition set(int index, BeanDefinition element) {
                return null;
            }

            @Override
            public void add(int index, BeanDefinition element) {

            }

            @Override
            public BeanDefinition remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<BeanDefinition> listIterator() {
                return null;
            }

            @Override
            public ListIterator<BeanDefinition> listIterator(int index) {
                return null;
            }

            @Override
            public List<BeanDefinition> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
}
