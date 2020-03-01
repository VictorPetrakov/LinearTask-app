package by.htp.hometask.linearprogram;

public class HomeworkLinear {
	
	public static void main (String args[]) {
		
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37_1();
		task37_2();
		task37_3();
		task37_4();
		task37_5();
		task37_6();
		task37_7();
		task37_8();
		task37_9();
		task38_a();
		task38_b();
		task39();
		task40_1();
		task40_1();
	}
	
	public static void task01() {
		
		System.out.println("1. Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное.");
		
		int x;
		int y;
		int z;//сумма
		int a;//разность
		int b;//произведение
		int c;//частное
		
		x = 12;//произвольное значение
		y = 6;//произвольное значение
		
		z = x + y;
		a = x - y;
		b = x * y;
		c = x / y;
		
		System.out.println("Сумма x и y = " + z + "\nРазность  x и y = " + a + "\nПроизведение  x и y = " + b + "\nЧастное  x и y = " + c);
		
		System.out.println();
	}
	
	public static void task02() {
		
		System.out.println("2. Найдите  значение функции: с = 3 + а.");
		
		int a;
		int c;
		
		a = 4;//произвольное значение
		
		c = 3 + a;
		
		System.out.println("Значение функции с = " + c);
		
		System.out.println();
	}
	
	public static void task03() {
		
		System.out.println("3. Найдите  значение функции: z = 2 * x + ( y – 2 ) * 5.");
		
		 int x;
		 int y;
		 int z;
		 
		 x = 5;//произвольное значение
		 y = 4;//произвольное значение
		 
		 z = 2 * x + (y - 2) * 5;
		 
		 System.out.println("Значение функции z = " + z);
		 
		 System.out.println();
	}
	
	public static void task04() {
		
		System.out.println("4. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.");
		
		int a;
		int b;
		int c;
		double z;
		
		a = 5;//произвольное значение
		b = 3;//произвольное значение
		c = 2;//произвольное значение
		
		z = ( (a - 3) * b / 2 ) + c;
		
		System.out.println("Значение функции z = " + z);
		
		System.out.println();
	}
	
	public static void task05() {
		
		System.out.println("5. Составить алгоритм нахождения среднего арифметического двух чисел");
		
		int x;
		int y;
		double z;
		
		x = 7;//произвольное значение
		y = 2;//произвольное значение
		
		z = (x + y) / 2.0;
		
		System.out.println("Среднее арифметическое числа " + x + " и " + y + " равно " + z);
		
		System.out.println();
	}
	
	public static void task06() {
		
		System.out.println("6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,\n" + "если в каждом большом бидоне на 12 л. больше, чем в малом?");
		
		int n; //количество малых бидонов
		int m; //количество больших бидонов
		double x; //количество молока в m больших бидонах
		double y; //количество молока в n малых бидонах
		
		y = 80;//произвольное значение
		n = 10;//произвольное значение
		m = 5;//произвольное значение

		x = m * (y/n + 12);
		
		System.out.println("В " + m + " больших бидонах " + x + " л. молока");
		
		System.out.println();
	}
	
	public static void task07() {
		
		System.out.println("7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника");
		
		int x;//ширина прямоугольника
		double z;//площадь прямоугольника
		
		x = 2;//произвольное значение
		
		z = Math.pow(x, 2) * 2;
		
		System.out.println("Площадь прямоугольника равна " + z);
		
		System.out.println();
	}
	
	public static void task08() {
		
		System.out.println("8. Вычислить значение выражения по формуле (все переменные принимают действительные значения): (b+sqrt(pow(b, 2) + 4 * a * c) / 2 * a) - pow(a, 3) * c + pow(b, -2).");
		
		double a;
		double b;
		double c;
		double z;
		
		a = 1;//Произвольное значение
		b = 1;//Произвольное значение
		c = 1;//Произвольное значение
		
		z = ( (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c) + (Math.pow(b, -2));
		
		System.out.println("Значение увыражение равно " + z);
		
		System.out.println();
	}
	
	public static void task09() {
		
		System.out.println("9. Вычислить значение выражения по формуле (все переменные принимают действительные значения): ((a / c) * (b / d)) - ((a * b - c)) / c * d)");
		
		//при скоращении заданое выражение примет вид 1 / d.
		
		double d;
		double z;
		
		
		d = 2;//Произвольное значение
		
		z = 1 / d;
		
		System.out.println("Значение выражения равно " + z);
		
		System.out.println();
	}
	
	public static void task10() {
		
		System.out.println("10. Вычислить значение выражения по формуле (все переменные принимают действительные значения): (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(xy)");
		
		double a;//значение угла в градусах
		double b;//значение угла в градусах
		double x;//значение угла в радианах
		double y;//значение угла в радианах
		double z;
		
		a = 45;//Произвольное значение
		b = 50;//Произвольное значение
		
		x = 0.0175 * a;
		y = 0.0175 * b;
		
		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
	
		System.out.println("Значение выражение равно " + z);
		
		System.out.println();
	}
	
	public static void task11() {
		
		System.out.println("11. Вычислить периметр и площадь прямоугольного треугольника по длиннам а и b двух катетов.");
		
		double a;//катет 
		double b;//катет
		double S;//площадь
		double P;//периметр
		
		a = 2;//произвольные
		b = 4;//значения
		
		S = (a * b)/2;
		
		P = (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) + a + b;
		
		System.out.println("Площадь тругольника равна " + S + "\nПериметр треугольника равен " + P);
		
		System.out.println();
	}
	
	public static void task12() {
		
		System.out.println("12. Вычислить растояние между двумя точками с данными координатами (x1, y1) и (x2, y2). ");
		
		//расстояние равно d = sqrt(x2−x1)2+(y2−y1)2, порядок точек не играет роли. Расстояние считается положительным, поэтому корень берется с одним знаком (плюс).
		
		double x1;//координата x первой точки
		double y1;//координата y первой точки
		double x2;//координата x второй точки
		double y2;//координата y второй точки
		double z;//расстояние между точками
		
		x1 = 20;//произвольное значение
		x2 = 50;//произвольное значение
		y1 = 45;//произвольное значение
		y2 = 90;//произвольное значение
		
		z = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("Расстояние между точками А и В равно " + z);
		
		System.out.println();
	}
	
	public static void task13() {
		
		System.out.println("13. Заданы координаты трех вершин треугольника (x1, y1),(x2, y2),(x3, y3) найти его периметр и площадь.");
		
		double x1, y1;//координаты вершины А 
		double x2, y2;//координаты вершины В
		double x3, y3;//координаты вершины С
		double p;// периметр треугольника
		double s;// площадь треугольника
		double ab;//длина стороны АВ
		double ac;//длина стороны AC
		double bc;//длина стороны 
		double p1;//полупериметр треугольника
		
		x1 = 25;//произвольное значение
		y1 = 15;//произвольное значение
		x2 = 30;//произвольное значение
		y2 = 40;//произвольное значение
		x3 = 23;//произвольное значение
		y3 = 30;//произвольное значение
		
		ab = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		ac = Math.sqrt((Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
		bc = Math.sqrt((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)));
		
		p = ab + ac + bc;
		
		p1 = p / 2;
		
		s = Math.sqrt(p1 * (p1 - ab) * (p1 - ac) * (p1 - bc));
		
		System.out.println("Площадь треугольника равна " + s + "\nПериметр треугольника равен " + p + "\nСтороны треугольника равны " + ab + " " + ac + " " + bc);
		
		System.out.println();
	}
	
	public static void task14() {
		
		System.out.println("14. Вычислить площадь круга и длину окружности одного и того же заданного радиуса R.");
		
		double r;//радиус окружности
		double s;//площадь
		double l;//длина окружности
		
		r = 10;
		
		s = Math.PI * Math.pow(r, 2);
		
		l = 2 * Math.PI * r;
		
		System.out.println("Площадь круга равна " + s + "\nДлина окружности равна " + l);
		
		System.out.println();
	}
	
	public static void task15() {
		
		System.out.println("15. Написать программу которая выводит на экран первые четыре степени числа пи");
		
		double x;
		
		for(int i = 0; i < 4; i++) {
			
			x = Math.pow(Math.PI, i);
			
			System.out.println("Число пи в " + i + " степени равно " + x);
			
			System.out.println();
		}
	}
	
	public static void task16() {
		
		System.out.println("16. Найти произведение цифр заданного четырехзначного числа.");
		
		int x;//четырехзначное число
		int a;//1-я цифра
		int b;//2-я цифра
		int c;//3-я цифра
		int d;//4-я цифра
		int z;//произведение цифр

		x = 2569;//произвольное значение
		
		a = (x/1000);
		
		b = (x / 100) % 10;
		
		c = (x / 10) % 10;
		
		d = x % 10;
		
		z = (a * b * c * d);
		
		System.out.println(a + " " + b + " " + c + " " + d);
		
		System.out.println("Заданное чило " + x + "\nПроизведение его цифр равно " + z);
		
		System.out.println();
	}
	
	public static void task17() {
		
		System.out.println("17. Даны два числа. Найти среднее арефметическое кубов этих чисел и среднее геометрическое модулей этих числел.");
		
		double x;
		double y;
		double s;//среднее арефметическое кубов x и y
		double g;//среднее геометрическое модулей x и y
		
		x = 1;//произвольное значение
		y = 1;//произвольное значение
		
		s = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
		
		g = Math.sqrt(Math.abs(x) * Math.abs(y));
		
		System.out.println("Среднее арефметическое кубов х и у равно " + s + "\nСреднее геометрическое модулей х и у равно " + g);
		
		System.out.println();
	}
	
	public static void task18() {
		
		System.out.println("18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и обьем этого куба.\r\n" + 
						"S1 = x^2;(площапдь грани); S2 = 6*x^2;(площадь полной поверхности); V = x ^3(обьем куба)");
		
		double x;//длина ребра куба
		double s1;//площадь грани
		double s2;//площадь полной поверхности
		double v;//обьем куба
		
		x = 2;//произвольное значение
				
		s1 = Math.pow(x, 2);
		
		s2 = s1 * 6;
		
		v = Math.pow(x, 3);
		
		System.out.println("Площадь грани куба равна " + s1 + "\nПлощадь полной поверхности куба равна " + s2 + "\nОбьем куба равна " + v);
		
		System.out.println();
	}
	
	public static void task19() {
		
		System.out.println("19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружности");
		
		double x;//длина стороны равностороннего треугольника
		double s;//площадь равностороннего треугольника
		double h;//высота равностороннего треугольника
		double r1;//радиус вписанной окружности
		double r2;//радиус описанной окружности
		
		x = 5;//произвольное значение 
		
		h = (x * Math.sqrt(3))/2;
		
		s = (x * h)/2;
		
		r1 = x / (2 * Math.sqrt(3));
		
		r2 = x / Math.sqrt(3);

		System.out.println("Площадь равностороннего треугольника " + s + "\nВысота равностороннего треугольника " + h + "\nРадиус вписанной окружности " + r1 + "\nРадиус описанной окружности " + r2);
		
		System.out.println();
	}
	
	public static void task20(){
		
		System.out.println("20. Известна длина окружности. Найти площадь круга ограниченного этой окружностью.");
		
		double l;//длина окружности
		double s;//площадь круга
		
		l = 10;//произвольное занчение
		
		s = (Math.pow(l, 2))/(4 * Math.PI);
		
		System.out.println("Площадь круга равна " + s);
		
		System.out.println();
	}
	
	public static void task21() {
		
		System.out.println("21. Дано действительное число R вида nnn.ddd (три цифровых разряда для дробной и целой частях).\r\n" + 
							" *  Поменять местами дробную и целую части числа и вывести полученное значение числа."	);
		
		double x;
		double y;
		
		x = 342.789;//произвольное значение
		
		y = (x * 1000) % 1000 + (int) x / 1000.0;
		
		System.out.println("Было " + x + " Стало " + y);
		
		System.out.println();
	}
	
	public static void task22() {
		
		System.out.println("22. Дано натуральное чиcло Т которое представляет длительность прошедшего времени в секундах. \r\n" + 
				"  Вывести данное занчение длительности в часах минутах и секундах в следующей форме:\r\n" + 
				"  ННчас ММмин SSсек");
		
		int t;
		int h;
		int m;
		int s;
		
		t = 6542;//произвольное значение
		
		h  = t / 3600;  
		
		m = (t % 3600) / 60;
		
		s = (t % 3600) / 60;
		
		System.out.println("T = " + t + " секунд равно " + h + " чч " + m + " мм " + s + " сек ");
		
		System.out.println();
	}
	
	public static void task23() {
		
		System.out.println("23. Найти площадь кольца внутренний радиус которого равен r, а внешний R , (R>r)");
		
		double r1;
		double r;
		double s;

		r1 = 10;//произвольное значение
		r = 5;//произвольное значение
		
		s = Math.PI * (Math.pow(r1, 2) - Math.pow(r, 2));
		
		System.out.println("Площадь кольца равна " + s);
		
		System.out.println();
	}
	
	public static void task24() {
		
		System.out.println("24. Найти площадь равнобедренной трапеции с основаниями a и b и углом альфа при большем основании a.");
		
		double a;//большее основание
		double b;//меньшее основание
		double h;//высота трапеции
		double x;//угол в градусах
		double y;//угол в радианах
		double s;//площадь трапеции
		
		a = 20;//произвольное значение
		b = 10;//произвольное значение
		x = 45;//произвольное значение
		
		y = (Math.PI / 180) * x;
		
		h = ((a - b) / 2) * Math.tan(y);
		
		s = ((a + b) * h) / 2;
		
		System.out.println("Площадь трапеции равна " + s);
		
		System.out.println();
	}
	
	public static void task25()	{
		
		System.out.println("25. Вычислить корни квадратного уравнения ax^2 + bx + c = 0 с заданными коэфициентами a, b и с \r\n" + 
				" (предполагается что а не равно 0 и что дискрименант выражения не отрицателен).");
		
		double a;
		double b;
		double c;
		double x1;//первый корень
		double x2;//второй корень
		double d;//дискрименант
		
		a = 1;//произвольное значение
		b = -3;//произвольное значение
		c = -4;//произвольное значение
		
		d = (Math.pow(b, 2)) - (4 * a * c);
		
		if(d >= 0 && a != 0) {
		
			x1 = (- b - Math.sqrt(d)) / (2 * a);
		
			x2 = (- b + Math.sqrt(d)) / (2 * a);
			
			System.out.println("Корни уравнения равны " + x1 + " и " + x2);
		}
		else {
			
			System.out.println("Дискрименант отрицателен или а равен нулю!!!");
				
		}
		System.out.println();
	}
	
	public static void task26() {
		
		System.out.println("26. Найти площадь треугольника, две стороны которого равны a и b, а угол между этими сторонами y.");
		
		double a;
		double b;
		double y;//угол между a и b в градусах
		double x;//угол между a и b в радианах
		double s;//площадь треугольника
		
		a = 10;//произвольные значения
		b = 20;//произвольные значения
		y = 45;//произвольные значение 
		
		x = (Math.PI / 180) * y;
		
		s = (a * b * Math.asin(x) )/ 2;
		
		System.out.println("Площадь треугольника равна " + s);
		
		System.out.println();
	}
	
	public static void task27() {
		
		System.out.println("27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за \r\n" + 
				" три операции и  а10 за четыре операции.");
		
		double a;
		double x;
		double y;
		double z;
		double w;
		
		a = 2;//произвольное значение
		
		x = a * a;
		y = x * x;
		z = y * y;// 'a' в 8 степени
		w = z * x;// 'a' в 10 степени
		
		System.out.println("'a' в 8 степени равно " + z + "\n'a' в 10 степени равно " + w);
		
		System.out.println();
	}
	
	public static void task28() {
		
		System.out.println("28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.");
		
		double x;//значение в радианах
		double y;//значение в градусах
		double m;//значение в минутах
		double s;//значение в секундах
		
		x = Math.PI;// произвольное значение
		
		y = x * (180 / Math.PI);// радианы -----> градусы
		m = y * 60;//градусы ------> минуты
		s = y * 3600;// градусы -----> секунды
		
		System.out.println("Значение " + x + " радиан равно\n " + y + " град.|| " + m + " мин.||" + s + " сек.");
		
		System.out.println();
	}
	
	public static void task29() {
		
		System.out.println("29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.");
		
		double a;
		double b;
		double c;
		double x;//косинус угла ab
		double y;//косинус угла bc
		double z;//косинус угла ac
		double ab;//угол ab в радианах
		double bc;//угол bc в радианах
		double ac;//угол ac в радианах
		double ab1;//угол ab в градусах
		double bc1;//угол bc в градусах
		double ac1;//угол ac в градусах

		a = 10;//произвольное значение
		b = 15;//произвольное значение
		c = 20;//произвольное значение
		
		z = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c); 
		
		x = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
		
		y = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * b * c);
		
		ab = Math.acos(x);
		bc = Math.acos(y);
		ac = Math.acos(z);
		
		ab1 = (180 / Math.PI) * ab;
		bc1 = (180 / Math.PI) * bc;
		ac1 = (180 / Math.PI) * ac;

		System.out.println(" Угол AB треугольника равен " + ab + " радиан или " + ab1+ " градусов\n" + " Угол BC треугольника равен " + bc + " радиан или " + bc1+ " градусов\n" + " Угол AC треугольника равен " + ac + " радиан или " + ac1+ " градусов\n");
		
		System.out.println();
	}
	
	public static void task30() {
		
		System.out.println("30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.");
		
		double r1;
		double r2;
		double r3;
		double x;//значение R2 * R3
		double y;//значение R1 * R3
		double z;//значение R1 * R2
		double r;// сопротивление соединения
		
		r1 = 5;//произвольное значение
		r2 = 10;//произвольное значение
		r3 = 15;//произвольное значение
		
		x = r2 * r3;
		y = r1 * r3;
		z = r1 * r2;
		
		r = (r1 * r2 * r3) / (x + y + z);
		
		System.out.println("Сопротивление соединения равно " + r);
		
		System.out.println();
	}
	
	public static void task31() {
		
		System.out.println("31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость \r\n" + 
				" течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.");
		
		double v;
		double v1;
		double t1;
		double t2;
		double s1;//путь лодки по озеру 
		double s2;//путь лодки по реке
		
		v = 20;//произвольное значение
		v1 = 4;//произвольное значение
		t1 = 5;//произвольное значение
		t2 = 6;//произвольное значение
		
		s1 = v * t1;
		
		s2 = (v - v1) * t2;
		
		System.out.println("Путь пройденый лодкой по озеру равен " + s1 + " км " + "\nПуть пройденый против течения реки равен " + s2 + " км ");
		
		System.out.println();
	}
	
	public static void task32() {
		
		System.out.println("32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать\n" + 
				" часы через р ч q мин r с?");
		
		int m; 
		int n; 
		int k;
		int p;
		int q;
		int c;
		
		m = 1;//произвольное значение
		n = 56;//произвольное значение
		k = 10;//произвольное значение
		
		p = 24;//произвольное значение
		q = 61;//произвольное значение
		c = 61;//произвольное значение
		
		System.out.println("На часах " + m + " ч. " + n + " мин. " + k + " сек.");
		System.out.println("Прибавим " + p + " ч. " + q + " мин. " + c + " сек.");
		
		
		if(p <= 24 && p >=0 ) {
			
			p = p % 24;
			
			m = m + p;

		}
		else {
			m = m + p;
		}
		if(m >= 24) {
	
				m = m % 24;
					
		}
		
		n = q + n;
		
		if(n >= 60) {
			
			m = m + (n / 60);
			n = n % 60;
			
		}
		
		k = c + k;
		
		if( k >= 60) {
			
			n = n + (k / 60);
			k = k % 60;
		}
		
		System.out.println("На часах " + m + " ч. " + n + " мин. " + k + " сек.");
		
		System.out.println();
	}
	
	public static void task33() {
		
		System.out.println("33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.");
		
		char ch;
		int code;
		
		ch = 'd';
		
		code = ch;
		
		System.out.println(code + " порядковый номер символа " + (char)(code));
		
		System.out.println("следующий символ " + (char)(code + 1) + " порядковый номер  " + (code + 1));
		
		System.out.println("предыдущий символ " + (char)(code - 1) + " порядковый номер " + (code - 1));
		
		System.out.println();
	}
	
	public static void task34() {
		
		System.out.println("34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.");
		
		double a;//обьем информации в байтах
		double b;//обьем информации в килобайтах
		double c;//обьем информации в мегабайтах
		double d;//обьем информации в гигабайтах
		double e;//обьем информации в терабайтах
		
		a = 256;
		
		b = a / Math.pow(10, 3);
		
		c = a / Math.pow(10, 6);
		
		d = a / Math.pow(10, 9);
		
		e = a / Math.pow(10, 12);
		
		System.out.println( a + " байт равно " + b + " килобайт " + c + " мегабайт " + d + " гигабайт " + e + " терабайт ");
		
		System.out.println();
	}
	
	public static void task35() {
		
		System.out.println("35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.");
		
		double m;
		double n;
		double r;
		int y;
		int x;
		
		m = 275;//произвольное значение 
		n = 9;//произвольное значение
		
		r = m/n;
		
		System.out.println("M / N равно " + r);
		
		y = (int)r;
		
		y = y % 10;
		
		System.out.println("Младшая цифра целой части " + y);
		
		x = (int)(r * 10);
		
		x = x % 10;
		
		System.out.println("Старшая цифра дробной части " + x);
		
		System.out.println();
	}
	
	public static void task36() {
		
		System.out.println("36. Найти частное произведений четных и нечетных цифр четырехзначного числа.");
		
		int n;
		int s1;//произведение четных цифр числа
		int s2;//произведение нечетных цифр числа
		double q;//частное произведений четных и нечетных цифр
		
		s1 = 1;
		s2 = 1;
		
		n = 2367;
		
		int newN = n;
		
		while(newN != 0) {
			if((newN % 10) % 2 == 0) {
				s1 = s1 * (newN % 10);
			}
			else {
				s2 = s2 * (newN % 10);
			}
			
			newN = newN / 10;
		}
		
		q = (double) s1 / s2;
		
		System.out.println("Произведение четных чисел равно " + s1 + "\nПроизведение нечетных чисел равно " + s2);
		
		System.out.println("Частное от произведения равно  " + q);
		
		System.out.println();
	}
	
	public static void task37_1() {
		
		System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, false — в противном случае:");  
		System.out.println("1.  Целое число N является четным двузначным числом");
		
		int n;
		
		n = 24;
			
		if(n > 9 && n < 100 && n % 2 == 0) {
				
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task37_2() {
		
		System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, false — в противном случае\n ");
		System.out.println("2. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.");
		
		int n;
		int sum1;
		int sum2;
		
		n = 6565;
		
		int newN = n;
		
		sum1 = (newN / 1000) + ((newN /100) % 10);
		sum2 = (newN % 10) + ((newN / 10) % 10);
		
		if(sum1 == sum2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task37_3() {
		
		System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, false — в противном случае\n ");
		System.out.println("3. Сумма цифр данного трехзначного числа N является четным числом.");
		
		int n;
		int sum;
		
		n = 235;//произвольное значение
		
		int newN = n;
		
		sum = (newN /100) + ((newN / 10) %  10) + newN % 10;
		
		if(sum % 2 == 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task37_4() {
		
		System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, false — в противном случае\n ");
		System.out.println("4. Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).");
		
		double x;
		double m;
		double n;
		
		m = 7;//произвольное значение
		n = 10;//произвольное значение
		
		x = 8;//произвольное значение
		
		if(x <= n && x >= m) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task37_5() {
		
		System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, false — в противном случае\n ");
		System.out.println("5.  Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.");
		
		int n;
		int sum;
		
		n = 111;//произвольное значение
		
		int newN = n;
		
		sum = newN % 10 + ((newN / 10) % 10) + (newN / 100);
		
		if(Math.pow(newN,2) == Math.pow(sum, 3)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task37_6() {
		
		System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, false — в противном случае\n ");
		System.out.println("6.  Треугольник со сторонами а,b,с является равнобедренным.");
		
		double a;
		double b;
		double c;
		
		a = 10;//произвольное значение
		b = 15;//произвольное значение
		c = 10;//произвольное значение
		
		if(a == b || a == c || b ==c) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task37_7() {
		
		System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, false — в противном случае\n ");
		System.out.println("7. Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.");
		
		int n;
		int a;//1-я цифра
		int b;//2-я цифра
		int c;//3-я цифра
		int q;//сумма двух цифр
		int z;//сумма двух цифр
		int w;//сумма двух цифр
		
		n = 365;//произвольное значение
		
		int newN = n;
		
		a = newN / 100;
		b = (newN / 10) % 10;
		c = newN % 10;
		
		q = a + b;
		z = a + c;
		w = b + c;
		
		if(q == c || z == b || w == a) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task37_8() {
		
		System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, false — в противном случае\n ");
		System.out.println("8. Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).");
		
		double n;
		double x;
		double a;
		double b;
		
		a = 12;//произвольное значение
		n = 144;//произвольное значение
		
		
		for(x = 0; x >= 0 && x <= 4; x++) {
			
			b = Math.pow(a, x);
			
			if(b == n) {
				
				System.out.println("True");	
				break;
			}
			
			if(b != n && x == 4) {
				
				System.out.println("False");
			}
		}
		
		System.out.println();
	}
	
	public static void task37_9() {
		
		System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, false — в противном случае\n ");
		System.out.println("9.  График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).");
		
		double a, b, c;
		double m;
		double n;
		double s;
		
		m = 5;//координаты точки
		n = 7;//координаты точки
		
		a = 1;//произвольные значение
		b = 3;//произвольные значение
		c = 2;//произвольное значение
		
		s = (a * Math.pow(m, 2)) + (b * m) + c;
		
		if(n == s) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task38_a() {
		
		System.out.println("38. Для данных областей составить  линейную программу, которая печатает  true, если точка  с  координатами (х,  у) принадлежит закрашенной области, и false — в противном случае:");
		System.out.println("График a :");
		
		double x;
		double y;
		
		x = 3;//произвольное значение
		y = 2;//произвольное значение
		
		if(y + Math.abs(x) >= 4 && y >= 0 && y <= 4 && x >= -4 && x <= 4) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task38_b() {
		
		System.out.println("38. Для данных областей составить  линейную программу, которая печатает  true, если точка  с  координатами (х,  у) принадлежит закрашенной области, и false — в противном случае:");
		System.out.println("График b :");
		
		double x;
		double y;
		
		x = 3;//произвольное значение
		y = 4;//произвольное значение
		
		if((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
		
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task38_c() {
		
		System.out.println("38. Для данных областей составить  линейную программу, которая печатает  true, если точка  с  координатами (х,  у) принадлежит закрашенной области, и false — в противном случае:");
		System.out.println("График b :");
		
		double x;
		double y;
		
		x = 2;//произвольное значение
		y = 3;//произвольное значение
		
		if(((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0)){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
	}
	
	public static void task39() {
		
		System.out.println("39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, \r\n" + 
				"сложения и вычитания, вычислите за минимальное число операций: 2x^4 - 3х^3 + 4х^2 - 5х + 6");
		
		int x;
		int s;
		
		x = 5;//произвольное значение
		
		s = x * (x * (x * (2 * x - 3) + 4) -5) + 6;
		
		System.out.println("Значение выражения равно " + s);
		
		System.out.println();
	}
	
	public static void task40_1() {
		
		System.out.println("40. Дано значение х. Получить значения  -2х + 3х^2 - 4х^3. Позаботьтесь об экономии операций. ");
		
		int x;
		int s;
		
		x = 5;//произвольное значение
		
		s = -x * (x * (3 * x - 3) + 2);
		
		System.out.println("Значение выражения равно " + s);
		
		System.out.println();
	}
	
	public static void task40_2() {
		
		System.out.println("40. Дано значение х. Получить значения  1 + 2х + 3х^2 + 4х^3. Позаботьтесь об экономии операций. ");
		
		int x;
		int s;
		
		x = 5;//произвольное значение
		
		s = x * (x * (4 * x + 3) + 2) + 1;
		
		System.out.println("Значение выражения равно " + s);
		
		System.out.println();
	}
}
