import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu{

    String name;

    int price;

    String explanation;

    Scanner sc = new Scanner(System.in);

    List<Menu> menuList = new ArrayList<>();
    List<Menu> cart = new ArrayList<>();

    public Menu(String name, int price, String explanation){
        this.name=name;
        this.price = price;
        this.explanation=explanation;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getExplanation() {
        return explanation;
    }

    @Override
    public String toString() {
        return name + " | " + price + "원 | " + explanation;
    }


    public void show(){
        System.out.println("Buger King입니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 주세요");
        System.out.println();
        System.out.println("[ Buger King MENU ]");
        System.out.println("1.Whopper           |버거킹의 와퍼");
        System.out.println("2.Chicken           |버거킹의 치킨");
        System.out.println("3.Drinks            |버거킹의 음료");
        System.out.println("4.Dessert           |버거킹의 디저트");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5.Order             |장바구니를 확인 후 주문합니다.");
        System.out.println("6.Cancel            |진행중인 주문을 취소합니다");
    }

    public void whopperMenu(){
        System.out.println("[ Whopper MENU ]");
        menuList.add(new Menu("기네스와퍼", 9300, "기네스와퍼버거"));
        menuList.add(new Menu("몬스터와퍼", 9300, "디아블로소스가 곁들어진 와퍼버거"));
        menuList.add(new Menu("와퍼", 6900, "기본와퍼버거"));
        menuList.add(new Menu("와퍼 주니어", 4600, "주니어 와퍼버거"));
        for(int i=0; i<4; i++){
            System.out.println((i+1)+"."+menuList.get(i));
        }
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();
    }

    public void chickenMenu(){
        System.out.println("[ Chicken MENU ]");
        menuList.add(new Menu("롱치킨버거", 4600, "롱치킨 버거"));
        menuList.add(new Menu("킹치킨버거", 3600, "치킨이 들어간 버거"));
        menuList.add(new Menu("바삭킹", 5600, "매운 치킨"));
        menuList.add(new Menu("너겟킹", 4000, "치킨 조각"));

        for(int i=0; i<4; i++){
            System.out.println((i+1)+"."+menuList.get(i));
        }
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();
    }
    public void drinksMenu(){
        System.out.println("[ Drinks MENU ]");
        menuList.add(new Menu("코카콜라", 2100, "코카콜라"));
        menuList.add(new Menu("제로콜라", 2100, "칼로리 없는 콜라"));
        menuList.add(new Menu("펩시제로", 2100, "칼로리 없는 펩시"));
        menuList.add(new Menu("스프라이트", 2100, "시원한 스프라이트"));

        for(int i=0; i<4; i++){
            System.out.println((i+1)+"."+menuList.get(i));
        }
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();

    }

    public void dessertMenu(){
        System.out.println("[ Dessert MENU ]");
        menuList.add(new Menu("아이스크림", 900, "달콤한 아이스크림"));
        menuList.add(new Menu("아메리카노", 1500, "진한 아메리카노"));
        menuList.add(new Menu("핫초코", 2000, "진한 핫초코"));
        menuList.add(new Menu("치즈스틱", 2000, "맛있는 치즈시틱"));

        for(int i=0; i<4; i++){
            System.out.println((i+1)+"."+menuList.get(i));
        }
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();
    }



    }







