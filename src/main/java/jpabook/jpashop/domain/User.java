package jpabook.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

public class User {
    @Id @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String name;

    /*
    * 임베디드 : 내장 엔티티, user엔티티에 생기는 것으로, crud가 필요없는 해시태그 등을 구현하고자 할 때 사용한다.
    * @Entity : 독립적인 엔티티, 다른 엔티티에서도 참조될 가능성이 있거나 crud 작업이 필요한 경우 등
    * */
    @Embedded
    private Address address;

    private List<Order> orders = new ArrayList<>();
}
