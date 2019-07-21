# ajou-dirtycode
Dirty code for refactoring

1. test 작성
    name, sellIn, quality 중 일부만 조건을 두고 test를 작성하면 조건이 중복되는데 확인하지 못하는 경우가 있어서
    name: Aged, Backstage, Sulfuras, name(3 다 아님)
    sellIn: x < 0, 0 <= x < 6, 6 <= x < 11, x >= 11
    quality: x <= 0, 0 < x < 50, x >= 50
    위 조건에 해당하는 test 작성
    총 48(4 * 4 * 3) - 12(name이 Sulfuras인 조건은 존재x) = 36개의 test 작성