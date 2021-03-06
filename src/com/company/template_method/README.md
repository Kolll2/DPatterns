Шаблонный метод (анл. Template method) — поведенческий шаблон проектирования, определяющий основу алгоритма и позволяющий наследникам переопределять некоторые шаги алгоритма, не изменяя его структуру в целом.
#Применимость
*Однократное использование инвариантной части алгоритма, с оставлением изменяющейся части на усмотрение наследникам.
*Локализация и вычленение общего для нескольких классов кода для избегания дублирования.
*Разрешение расширения кода наследниками только в определенных местах.
#Участники
*Abstract class (абстрактный класс) - определяет абстрактные операции, замещаемые в наследниках для реализации шагов алгоритма; реализует шаблонный метод, определяющий скелет алгоритма. Шаблонный метод вызывает замещаемые и другие, определенные в Abstract class, операции.
**Помните, что потомок должет передоставлять полную реализацию всех абстрактных операций, поэтому колличество абстрактых шагов желательно своидить к минимуму.
**Укрупнение абстактных шагов алгоритма, чаще всего приводит к снижению гибкости архитектуры, но не к снижению затрат времи на сосдание конкретной реализации.
**Если абстрактый шаг алгоритма, может ности пустую реализацию, подумайте, может стоит его реализовать как hook метод.
*Concrete class (конкретный класс) - реализует замещаемые операции необходимым для данной реализации способом.
*Concrete class предполагает, что инвариантные шаги алгоритма будут выполнены в AbstractClass.
Существуют дополнительные особенности шаблонного метода:
*Hook - метод объявленный абстактным классом, но имеющий пустую реализация (возможна реализация по умолчанию). Данный метод может быть переопределен в субклассах с добовлением необходимой логиги. Хуки могут быть добавлены на разных этапах исполнения родительского алгоритма, давая гибкость его изменения или точки для исполнения дополнительных действий напрямую не звязанных с родительским алгоритмом.
**Hook-и используются для логики, которую необязательно реализовывать в потомке.
#Литература
*Э. Гамма, Р. Хелм, Р. Джонсон, Дж. Влиссидес. Приемы объектно-ориентированного проектирования. Паттерны проектирования = Design Patterns: Elements of Reusable Object-Oriented Software. — СПб: «Питер», 2007. — С. 366. — ISBN 978-5-469-01136-1. (также ISBN 5-272-00355-1)
*Фримен Э., Сьерра К., Бейтс Б. Паттерны проектирования = Head First Design Patterns A Brain-Friendly Guide СПб: «Питер», 2017. — С. 656. — ISBN 978-5-496-00782-5.