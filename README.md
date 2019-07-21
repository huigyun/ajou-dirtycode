# ajou-dirtycode
Dirty code for refactoring

1. test 작성
    name, sellIn, quality 중 일부만 조건을 두고 test를 작성하면 조건이 중복되는데 확인하지 못하는 경우가 있어서
    name: Aged, Backstage, Sulfuras, name(3 다 아님)
    sellIn: x < 0, 0 <= x < 6, 6 <= x < 11, x >= 11
    quality: x <= 0, 0 < x < 50, x >= 50
    위 조건에 해당하는 test 작성
    총 48(4 * 4 * 3) - 12(name이 Sulfuras인 조건은 존재x) = 36개의 test 작성

2. refactoring
    a. 불필요한 조건문(한번만 확인하면 되는 조건문) 가장 밖으로 꺼내기
        모든 조건문에 대하여 name이 Sulfuras인 조건은 없으므로 가장 밖으로 꺼내서 처리
    b. 중복된 조건문 병합하기
        같은 조건을 다루는 조건문은 하나로 합쳐서 처리
    c. refactoring 과정 마다 test 수행
        하나의 refactoring에 test 1회 수행으로 유효한지 검사

3. 과정
    Refactoring #1:
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) 문 가장 밖으로 꺼냄
    Refactoring #2:
        불필요한 else 문 삭제
    Refactoring #3:
        중복된 조건문이 없도록 name 별로 조건문 쪼개기
    Refactoring #4:
        name 별로 쪼갠 조건문에 해당하는 중복된 조건문들 포함시키기