package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter @Setter
@Data // @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 모두 포함, 실제 서비스에선 사용하지 않는 것이 좋다.
public class Item {

        private Long id;
        private String itemName;
        private Integer price; // 가격정보
        private Integer quantity; // 수량정보

        public Item() {
        }

        public Item(String itemName, Integer price, Integer quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }
}
