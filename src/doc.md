\#variables

* variable  có 3 kiểu :
1 local variable : được khai báo trong  method \_ > chỉ được dùng trong chính method đó thôi
2 insatance variable được khai báo trong class
3 static variable : được khai báo và chỉ được sử dụng trong chính class đấy thooi
* ép type data
1 widening tying casting
2 narowing type cáting
3 overflow
4 type promotion    ( byte thì thường thực hiện nếu k ép type thì sẽ tự chuyển thành int)

# data type

* có 2 dạng
\*\*  primitive
1 boolean
2 bye
3 short
4 int
5 long
6 float
7 double  
8 char  mã unicode
\*\* non-primitive
1 class
2 interface  method rông mà các child class phải kế thừa
3 arrays
4  String
5 Enum

# unicode

là mã để định nghĩa các  ngôn ngữ khác nhau  biểu thị dưới dạng nhị phân để máy hiểu

# operators

gồm 8 l
1 : unary : lưu ý  toán tử tử ++ number ++  trước thì thực hiện trước \\ sau thì thực hiện sau

2 arithmetic :  phép toán bình thường
3:  shift  : dịch chuyển bit

4 relation : so sánh

5 bitwise : kiểu nhị phân

6 logic

7 ternary : 3 ngoi  variable = expersiion1 ? experssion 2 : expression3

8 asignment

# control statements

3 type of control

1decison making statement

2 loop statemetns

3 jumpstatements





**if - else**
kiểu tra ddiefu kiện rồi trả về kết quả

còn ddiefu loại 3 tương tự chỉ khác là nó khai báo biến(giống)



**for**

for dùng cho nếu biết số lần lặp

for lồng nhau thì thương để xử lí dư liệu da chiều , in ấn mô hình đồ họa

for each để lấy các phần tử trong mảng

for (labelled for ) : dùng kết hộ vs break và continue  ( cho tiếp tục hay bỏ qua thoog qua break hay continue labelname)

for ( infinitive for )  : vòng vô tận : dùng cho truowngf hợp game loop , .. .





**switch**

kiểm tra dữ liệu vs 1 biến giá trị hoàng loạt



**while**

dung cho khi biết ddiefu kiện | chạy đến khi true

4 tính chất quan trong oopp

inheritance : cho phép sử dụng method  vs attribute

Polymorphism: khi lớp con kế thừa có thể ghi ddefp lại method

Abstraction: ở class cha sẽ khai báo 1 method bắt buộc nhưng k có nội dung , buộc class con phải kế thừa

Encapsulation : giấu  dữ liệu ( trong 1 class) private



**set name class , method**

tên class viết hoa chữ cái đầu

tên biến thì viết theo kiểu lạc đà

interface thì viết hoa chữ cái đầu và từ đó nên là (adj )



**class**

là thứ tạo ra  các object

*1 class bao gồm*

varialbe

methods

contructor

interdace

...

**object**

là 1 thục thể được miêu tả

**method**

khối lệnh tái sử dụng

có 2 loại chính

Predefined Method

User-defined Method





**contructor**

dung đểgọi tự động khi tạo ra 1 đối tượng

có  2 loại

1 là khong có tham số

2 là có tham số

note : khong void kkhong int , ...

không static , final ,  abstract







**inheritances**

\-giúp subclass/childclass kế thừa  thuộc tính , method của parentclass/ superclass

\-có lợi ích
1 method overriding

2 code reusability



\-có 4 type of inheritance

1 single inheritance : a subclass inherts a superclass only ( 1 -1)

2 multilevel inheritance : a class is dderived from a subclass, form a chain of inheritance

3 hierarchical ingeritance : multilevel class inherts the same superclass

4 hybrid inheritance: combones 2 or more inheritance thought interface ( no class) (note: multiple inheritance use interface ) not  extend class



**..aggration**

\-1 class có thể là entity của 1 class other   ( ví dụ tập a là tập con của c )







**polymorphism**



**method overloading**

\-method có cùng tên nhưng có các parameters khác nhau ( nhiều hơn hoặc có thể khác kiểu dữ lieu ( trong cùng 1 method được defined ) ) được khai báo chung trong cùng 1 class

\-trong 1 method overloading khi khai báo type data , nếu 2 type data khác nhau thì khi return sẽ đuộc up type data ( typepromotion ) với điều kiện là không được ep kiểu trả về  -> nếu ép kiểu trả về thì sẽ bị lỗi

\-2 method overloading going nhau (name và có cùng số lượng tham số ( parameter) ) mà 2 type data được khai báo trong 2 method này so  le đối nhau kiểu type data thì sẽ gây lỗi . *example*  sum (int a , long b )  vs sum (long a, int b )

\-đặc biệt: về mặt rule thì đc khai báo mehthodoverload với namemethod là main nhưng nếu chỉ chạy thì chỉ có ( public static void Main (String\[] args )  được run



**method overriding**

\-method này được viết lại ở childClass going hệt với method của superclass (nameClass, parameter, datatype , return datatype)

note : khi superclass  khai báo pritve/final/static  thì childClass khống thể use methodoverriding



**covariant return type**

\-chp pheps method ở subclass  overriding được return 1subclass của kểu trả  về ở superclass



**supper**

\-use acess member ( variable, method , contructor) of superclass 1 cách trực tiếp

\-note:

1 lệnh " super()" khi  gọi constructor của superclass phải là lệnh đầu tiên trog childclass( constructor)

2 còn nếu khong viết ở phần constructor của childclass thì compilersự tự dộng chèn vào

3 super khong có hiểu quả dvs static



**instance initializer**

\-laf block code run auto khi tạo object, chỉ sau super() và trước constructor



**final**

\-final la khong dược thay đổi member( variable, method, class, parameter) và finale constructor khong tồn tại



**polymorphism**

\-1 action or method có thể thực hiện nhiều cách khác nhau

\-2 type polymorphism:

1compile-time dung method overloading : quyết định method nào đc call

2 runtime dung method overriding

**upcating**: dung biến tham chiếu của class trỏ dến object của class con (example: Animal a = new Dog())



**static and dynamic binding**

**binding** : quyết định method nào chạy

static : cái này là được quyết định bởi complile hay gặp ở static, pricate, final, overloading

dynamic: còn cái này được chạy khi chương trình chạy ( runtime)  dựa vào object \_>overriding



**instanceof**

\-kierm tra type cuar 1 object (qua class , interface )

note:

1 nếu object là nnull thì sẽ false

2insteanceof dung nhiều khi downcasting

