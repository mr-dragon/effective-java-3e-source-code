package effectivejava.chapter2.item2.javabeans;

/**
 * JavaBeansģʽ - ����һ�£�ǿ��Ҫ��ɱ��ԣ���11-12ҳ��
 */
public class NutritionFacts {
    // ������ʼ��ΪĬ��ֵ������У�
    private int servingSize  = -1; // ����;û��Ĭ��ֵ
    private int servings     = -1; // ����;û��Ĭ��ֵ
    private int calories     = 0;
    private int fat          = 0;
    private int sodium       = 0;
    private int carbohydrate = 0;

    public NutritionFacts() { }
    // Setters
    public void setServingSize(int val)  { servingSize = val; }
    public void setServings(int val)     { servings = val; }
    public void setCalories(int val)     { calories = val; }
    public void setFat(int val)          { fat = val; }
    public void setSodium(int val)       { sodium = val; }
    public void setCarbohydrate(int val) { carbohydrate = val; }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
}