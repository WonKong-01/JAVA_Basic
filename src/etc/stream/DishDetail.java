package etc.stream;

public class DishDetail {

    private final String dishname;
    private final String type;

    public DishDetail(Dish dish) {
        this.dishname = dish.getName();
        this.type = dish.getType().getDesc();
    }
}



