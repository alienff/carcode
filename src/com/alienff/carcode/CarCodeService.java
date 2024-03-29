package com.alienff.carcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mike
 * @since 7/15/12 12:31 AM
 */
class CarCodeService {
    private final static Map<Integer, String> regions = new HashMap<Integer, String>();

    static {
        regions.put(1, "Республика Адыгея");
        regions.put(2, "Республика Башкортостан");
        regions.put(102, "Республика Башкортостан");
        regions.put(3, "Республика Бурятия");
        regions.put(4, "Республика Горный Алтай");
        regions.put(5, "Республика Дагестан");
        regions.put(6, "Ингушская Республика");
        regions.put(7, "Кабардино-Балкарская Республика");
        regions.put(8, "Республика Калмыкия");
        regions.put(9, "Карачаево-Черкесская Республика");
        regions.put(10, "Республика Карелия");
        regions.put(11, "Республика Коми");
        regions.put(12, "Республика Марий Эл");
        regions.put(13, "Мордовская Республика");
        regions.put(14, "Республика Саха (Якутия)");
        regions.put(15, "Северо-Осетинская Республика");
        regions.put(16, "Республика Татарстан");
        regions.put(116, "Республика Татарстан");
        regions.put(17, "Республика Тува");
        regions.put(18, "Удмуртская Республика");
        regions.put(118, "Удмуртская Республика");
        regions.put(19, "Республика Хакасия");
        regions.put(20, "Чеченская Республика");
        regions.put(95, "Чеченская Республика");
        regions.put(21, "Чувашская Республика");
        regions.put(121, "Чувашская Республика");
        regions.put(22, "Алтайский край");
        regions.put(23, "Краснодарский край, Сочи");
        regions.put(93, "Краснодарский край, Сочи");
        regions.put(123, "Краснодарский край, Сочи");
        regions.put(24, "Красноярский край");
        regions.put(124, "Красноярский край");
        regions.put(25, "Приморский край");
        regions.put(125, "Приморский край");
        regions.put(26, "Ставропольский край");
        regions.put(27, "Хабаровский край");
        regions.put(28, "Амурская область");
        regions.put(29, "Архангельская область");
        regions.put(30, "Астраханская область");
        regions.put(31, "Белгородская область");
        regions.put(32, "Брянская область");
        regions.put(33, "Владимирская область");
        regions.put(34, "Волгоградская область");
        regions.put(35, "Вологодская область");
        regions.put(36, "Воронежская область");
        regions.put(37, "Ивановская область");
        regions.put(38, "Иркутская область");
        regions.put(138, "Иркутская область");
        regions.put(39, "Калининградская область");
        regions.put(40, "Калужская область");
        regions.put(41, "Камчатская область");
        regions.put(42, "Кемеровская область");
        regions.put(43, "Кировская область");
        regions.put(44, "Костромская область");
        regions.put(45, "Курганская область");
        regions.put(46, "Курская область");
        regions.put(47, "Ленинградская область");
        regions.put(48, "Липецкая область");
        regions.put(49, "Магаданская область");
        regions.put(50, "Московская область");
        regions.put(90, "Московская область");
        regions.put(150, "Московская область");
        regions.put(51, "Мурманская область");
        regions.put(52, "Нижегородская область");
        regions.put(152, "Нижегородская область");
        regions.put(53, "Новгородская область");
        regions.put(54, "Новосибирская область");
        regions.put(55, "Омская область");
        regions.put(56, "Оренбургская область");
        regions.put(57, "Орловская область");
        regions.put(58, "Пензенская область");
        regions.put(59, "Пермская область");
        regions.put(159, "Пермская область");
        regions.put(60, "Псковская область");
        regions.put(61, "Ростовская область");
        regions.put(161, "Ростовская область");
        regions.put(62, "Рязанская область");
        regions.put(63, "Самарская область");
        regions.put(163, "Самарская область");
        regions.put(64, "Саратовская область");
        regions.put(164, "Саратовская область");
        regions.put(65, "Сахалинская область");
        regions.put(66, "Свердловская область");
        regions.put(96, "Свердловская область");
        regions.put(67, "Смоленская область");
        regions.put(68, "Тамбовская область");
        regions.put(69, "Тверская область");
        regions.put(169, "Тверская область");
        regions.put(70, "Томская область");
        regions.put(71, "Тульская область");
        regions.put(72, "Тюменская область");
        regions.put(73, "Ульяновская область");
        regions.put(173, "Ульяновская область");
        regions.put(74, "Челябинская область");
        regions.put(174, "Челябинская область");
        regions.put(75, "Читинская область");
        regions.put(76, "Ярославская область");
        regions.put(77, "Москва");
        regions.put(99, "Москва");
        regions.put(97, "Москва");
        regions.put(177, "Москва");
        regions.put(199, "Москва");
        regions.put(197, "Москва");
        regions.put(78, "Санкт-Петербург");
        regions.put(98, "Санкт-Петербург");
        regions.put(178, "Санкт-Петербург");
        regions.put(79, "Еврейская автономная область");
        regions.put(80, "Агинский Бурятский автономный округ");
        regions.put(81, "Коми-Пермяцкий автономный округ");
        regions.put(82, "Корякский автономный округ");
        regions.put(83, "Ненецкий автономный округ");
        regions.put(84, "Таймырский автономный округ");
        regions.put(85, "Усть-Ордынский Бурятский автономный округ");
        regions.put(86, "Ханты-Мансийский автономный округ");
        regions.put(87, "Чукотский автономный округ");
        regions.put(88, "Эвенкийский автономный округ");
        regions.put(89, "Ямало-Ненецкий автономный округ");
        regions.put(91, "Резерв МВД России");
        regions.put(92, "Резерв МВД России");
        regions.put(94, "Резерв МВД России");
    }

    static String getRegion(int code) {
        return regions.get(code);
    }
}
