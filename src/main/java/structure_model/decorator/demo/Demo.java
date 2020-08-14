package structure_model.decorator.demo;

import structure_model.decorator.Item;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-05 10:52
 * @Version V1.0
 **/
public class Demo {

    public static void main(String[] args) {

        Item item = new Item("菜单");
        Item firstA = new Item("一级菜单1");
        Item firstB = new Item("一级菜单2");
        Item secondA1 = new Item("二级菜单a1");
        Item secondA2 = new Item("二级菜单a2");

        Item secondB1 = new Item("二级菜单b1");
        Item secondB2 = new Item("二级菜单b2");

        firstA.getList().add(secondA1);
        firstA.getList().add(secondA2);

        firstB.getList().add(secondB1);
        firstB.getList().add(secondB2);


        item.getList().add(firstA);
        item.getList().add(firstB);

        for (Item item1 : item.getList()) {
            System.out.println(item1.getName());
            if (item1.getList().size() > 0) {
                for (Item item2 : item1.getList()) {
                    System.out.println(item2.getName());
                }

            }
        }
    }
}
