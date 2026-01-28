package javacollectionsandstreams;

import java.util.ArrayList;
import java.util.List;

// ---------- MealPlan Interface ----------
interface MealPlan {
    void showMeal();
}

// ---------- Vegetarian Meal ----------
class VegetarianMeal implements MealPlan {

    @Override
    public void showMeal() {
        System.out.println("Vegetarian Meal: Rice, Dal, Vegetables");
    }
}

// ---------- Vegan Meal ----------
class VeganMeal implements MealPlan {

    @Override
    public void showMeal() {
        System.out.println("Vegan Meal: Fruits, Salad, Nuts");
    }
}

// ---------- Keto Meal ----------
class KetoMeal implements MealPlan {

    @Override
    public void showMeal() {
        System.out.println("Keto Meal: Eggs, Chicken, Cheese");
    }
}

// ---------- High Protein Meal ----------
class HighProteinMeal implements MealPlan {

    @Override
    public void showMeal() {
        System.out.println("High Protein Meal: Paneer, Beans, Protein Shake");
    }
}

// ---------- Generic Meal Class ----------
class Meal<T extends MealPlan> {

    private T mealPlan;

    Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    T getMealPlan() {
        return mealPlan;
    }
}

// ---------- Main Class ----------
public class MealPlanDemo {

    // Generic Method
    static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generating your personalized meal plan...");
        meal.showMeal();
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

        generateMeal(vegMeal.getMealPlan());
        generateMeal(veganMeal.getMealPlan());
        generateMeal(ketoMeal.getMealPlan());
        generateMeal(proteinMeal.getMealPlan());
    }
}
