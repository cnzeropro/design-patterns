package org.zero.structural.composite;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class CompositeTest {

    @Test
    public void test() {
        Component root = new Composite("root");

        Component leafA = new Composite("a");
        Component nodeB = new Composite("b");
        Component nodeC = new Composite("c");
        root.add(leafA);
        root.add(nodeB);
        root.add(nodeC);

        Component leafB1 = new Composite("b1");
        Component nodeB2 = new Composite("b2");
        nodeB.add(leafB1);
        nodeB.add(nodeB2);

        Component leafB21 = new Composite("b21");
        nodeB2.add(leafB21);

        Component leafC1 = new Composite("c1");
        Component leafC2 = new Composite("c2");
        Component leafC3 = new Composite("c3");
        nodeC.add(leafC1);
        nodeC.add(leafC2);
        nodeC.add(leafC3);

        root.print();
    }
}