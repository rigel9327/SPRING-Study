package hello.itemservice.domain.item;

public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String decription) {
        this.description = decription;
    }

    public String getDescription() {
        return description;
    }
}

