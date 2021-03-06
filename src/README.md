# CleanCode

Конспект учебника Clean Code (Robert C. Martin)

Глава 2: Содержательные имена

    Некоторые простые правила создания хороших имен.
________________________________________________________________________________________________________________________

    2.1 Имена должны передавать намерения программиста
    
        Имя переменной, функции или класса должно отвечать на все главные вопросы. Оно должно сообщить, почему эта 
        переменная (и т.д.) существует, что она делает и как используется. Если имя требует дополнительных комментариев, 
        значит оно не передает намерений прораммиста.
        
        Что делает следующий код?
       
        -> example1.getThem()
        
        Проблема кроется не в сложности кода, а в его неочевидности, т.е. степени, в которой контекст не следует явно из 
        самого кода. Код подразумевает, что мы знаем ответы на вопросы:
            1. Какие данные хранятся в theList?
            2. Чем так важен theList с нулевым индексом?
            3. Какой особый смысл имеет значение 4?
            4. Как будет использоваться возвращаемый список?
            
        Ответы на все эти вопросы не следуют из примера, хотя могли бы. Допустим мы работаем над игрой "Сапер". Игровое
        поле представлено в виде списка ячеек с именем theList. Переименуем его в gameBoard.
        
        Каждая ячейка игрового поля представлена простым массивом. Далее выясняется, что в элементе с нулевым индексом 
        хранится код состояния, а код 4 означает "флажок установлен". Даже простое присваивание имен всем этим 
        концепциям существенно улучшает код:
        
        -> example1.getFlaggedCells()
        
        Не изменилось ничего, кроме имен - но теперь можно легко понять, что здесь происходит.
        
    2.2 Избегайте дезинформации
    
        Не обозначайте группу учетных записей именем accountList, если только она действительно не хранится в списке.
        Слово "список" имеет для программиста вполне конкретный смысл. Если записи хранятся не в List, а в другом 
        контейнере, это может привести к ложным выводам. В этом примере подойдет имя accountGroup, bunchOfAccounts и 
        даже просто accounts.
        
        Остерегайтесь малозаметных различий в именах.
        
        Примеры дезинформирующих имен встречаются при использовании чтрочной "L" и прописной "O" в именах переменных, 
        особеннов комбинациях. Проблемы возникают из-за того, что эти буквы почти не отличаются от констант "1" и "0".
        
    2.3 Используйте осмысленные различия
    
        Если имена различаются, то они должны обозначать рахные понятия. Недостаточно добавить в имя серию цифр или 
        неинформативные слова, даже если компилятору .того будет достаточно.
        
        Неинформативные слова также применяются для создания бессодержательных различий. Допустим, у вас имеется класс с
        именем Product. Создав класс с именем ProductInfo или ProductData, вы создаете разные имена, которые по сути
        обозначают одно и то же.
        
        Неинформативные слова избыточны. Слово variable никогда не дожно встречаться в именах переменных. Слова table 
        никогда не должно встречаться в именах таблиц.
        
        Записывайте различающиеся имена так, чтобы читатель кода понимал, какой смыслзаложен в этих различиях.
        
    2.4 Используйте удобочитаемые имена