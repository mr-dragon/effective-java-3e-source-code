package effectivejava.chapter2.item2.telescopingconstructor;

/**
 * �������캯��ģʽ - ���ܺܺõ���չ�� ����10-11ҳ��
 */
public class NutritionFacts {
    /**
     *  (mL)            ����
     */
    private final int servingSize;
    /**
     *   (per container) ����
     */
    private final int servings;
    /**
     *  (per serving)   ��ѡ
     */
    private final int calories;
    /**
     *   (g/serving)     ��ѡ
     */
    private final int fat;
    /**
     *  (mg/serving)    ��ѡ
     */
    private final int sodium;
    /**
     *  (g/serving)     ��ѡ
     */
    private final int carbohydrate; 

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }
    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize  = servingSize;
        this.servings     = servings;
        this.calories     = calories;
        this.fat          = fat;
        this.sodium       = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola =
                new NutritionFacts(240, 8, 100, 0, 35, 27);
    }
    
}