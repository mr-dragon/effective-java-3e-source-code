package effectivejava.chapter2.item2.telescopingconstructor;

/**
 * 伸缩构造函数模式 - 不能很好地扩展！ （第10-11页）
 */
public class NutritionFacts {
    /**
     *  (mL)            必填
     */
    private final int servingSize;
    /**
     *   (per container) 必填
     */
    private final int servings;
    /**
     *  (per serving)   可选
     */
    private final int calories;
    /**
     *   (g/serving)     可选
     */
    private final int fat;
    /**
     *  (mg/serving)    可选
     */
    private final int sodium;
    /**
     *  (g/serving)     可选
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