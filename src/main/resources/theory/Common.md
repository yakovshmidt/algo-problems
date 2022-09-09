Rest:
https://www.restapitutorial.com/lessons/whatisrest.html#


how java virtual machine works
string pool

soft and weaked references
request despatcher
ELK (elastic, logstash, kibana)

Generics
Comparator vs Comparable
Stream
* spliterator
  io
  nio
  io vs nio
  Что такое utf 8
  Какой encoding использует Java string

Многопоточность:
* что такое Runnable?
* что такое Thread?
* что такое Callable?
* что такое Future?
* что такое CompletableFuture?
* что такое монитор?
* что такое мьютекс?
* что такое симафор?
* ReentrantLock для чего?
* ReadWriteLock для чего?
* CyclicBarrier для чего?
* что такое Future?
* что такое CompletableFuture?
* что такое ExecutorService?

Testing:
* что такое белый и чёрный ящики?
* что такое юнит, интеграционные, компонентные и сквозные тесты
*

Функциональное програмирование:
* что такое замыкания?

Soap vs rest

Singleton enum и double check locking

принципы:
* SOLID
* ACID
* DRY
* KISS
* YAGNI

collections
* hierarchy
* при каком заполнении бакета в Hash таблице, связанный список перестраивается в дерево
* HashMap
    * скорость получения элемента
        * из начала
        * из середины
        * из конца
    * скорость удаления элемента
        * из начала
        * из середины
        * из конца
    * скорость добавления элемента
        * из начала
        * из середины
        * из конца
    * Коллизии
    * Мехаизмы улучшения сложности доступа? treeify threshold?
    * отличия CuncurrentHashMap vs HashTable
    * что такое ArrayBlockingQueue
* LinkedHashSet
* ArrayList
* LinkedList
* Stack
* Queue
* Deque
* Set

garbage collection
* https://www.freecodecamp.org/news/garbage-collection-in-java-what-is-gc-and-how-it-works-in-the-jvm/

exceptions:
* структура эксепшнов
* что является checked и unchecked
* методы exception класса

изменился ли доступ к файлам в nio относительно io?
multithreading
* https://habr.com/ru/post/164487/
  что является checked и unchecked
  closeable vs autocloseable
  СAP теорема



Horizontal scaling, sharding, partinting


потоки
* что такое монитор
* какие мониторы бывают в java
* wait и notify
* fazer class
* reentrantlock
* что делает synchronize
* completable future
* что такое executor service
* есть стримы, есть parallelStream. какой из executorService'ов там используется?
* что такое ForkJoinPool

sql
* нормализация форм что такое
* сколько нормальных форм обычно используется?
* primary и foreign key
* joins
* что такое триггер
* что такое хранимая процедура
* уровни изоляции транзакций
* что такое фантомное чтение
* что такое грязное чтение
* ACID
* where vs having
* шадринг, репликация, партишинг
*

hibernate
* мы создали hibernate conf файл. кому его мы скормим?
* что такое session factory
* что такое session
* Optimistic  & pissimistoc lock
* Кэширование уровни как работает
* какие языки запросов использует hibernate? hql, native sql, criteria api
* какие бывают состояния объектов?
* n + 1 select

http
* что такое идемпотентный метод? - свойство объекта или операции при повторном применении операции к объекту давать тот же результат, что и при первом.
* REST vs SOAP
* SOAP vs HTTP
* Http vs https
* как работает https?
  REST - это способ обмена сообщениями по протоколу http, где  во главе http методы и ресурсы, которыми мы манипулируем
  Cors

Git
* fetch vs pull
* merge vs rebase
* squash что это?

паттерны
* синглтон

что такое CAP теорема?

nginx
* для чего нужен load balancer. типы балансировки

must have
https://www.educative.io/courses/grokking-the-system-design-interview/m2ygV4E81AR
https://www.educative.io/courses/web-application-software-architecture-101/RLApNkXY84R

Вопрос	Ответ
ООП

Getter и Setter для чего нужны?
Примитивные и ссылочные типы данных, в чем различия?
Как передаются объекты, по ссылке или по значению?	по значению

Массивы:
Что такое массив? это объект?	An object is a class instance or an array.
Как лучше всего скопировать массив?
Как работает Arrays.copy()?

+ модификторы доступа для полей и классов
+ final поля, методы и классы
+ static что это
+ equals
+ hashCode
* что это
* как вычисляется
* что значит native
* какое значение имеет by default





ООП

+ Getter и Setter для чего нужны?
+ Примитивные и ссылочные типы данных, в чем различия?
+ Как передаются объекты, по ссылке или по значению?

Массивы
+ Что такое массив? это объект?
+ Как лучше всего скопировать массив?
+ Как работает Arrays.copyOf()?



что будет есть нарушить нормализацию - данные могут затеряться. к примеру, есть связь у user -> roles. мы удаляем user и roles висят мертвым грузом

ForkJoinPool
ExecutorService

wildcards
* ковариантность, инвариантность, контрвариантность
* upper bounded wildcards, lower bounded wildcards

+ ArrayList
* скорость получения элемента
    * из начала
    * из середины
    * из конца
* скорость удаления элемента
    * из начала
    * из середины
    * из конца
* скорость добавления элемента
    * из начала
      из середины
    * из конца

Stream
+ отличие коллекции от stream?
  как работает parallelStream? сколько потоков будет создано?

Потоки
что такое ключевое слово volatile?
что такое executorService?

SQL
https://habr.com/ru/post/247373/
* что такое index?
* что такое кластеризованный индекс?
* что такое некластеризованный индекс?
* что такое уникальный индекс?
* что такое составной индекс?
*  как работает group by?
* для чего нужен having?
* что такое join и какие виды бывают (inner, outer, left, rigth)?

JPA


SPRING
вопрос:
что такое Dependency Injection, Inversion of control?
ответ:
DI - это архитектурный стиль, который помогает избежать жесткой связи объектов (когда внутри одного объекта создается другой посредством оператора new). Связь объектов происходит при помощи внедрения через конструктор, сеттер или метод. В результате мы получаем объекты без жестких связей, которыми удобнее пользоваться и тестировать.

вопрос:
что такое applicationContext и beanFactory?
ответ:
applicationContext и beanFactory - это контейнеры spring. ApplicationContext наследуется от BeanFactory и имеет более широкий функционал.
BeanFactory более легковесна, чем ApplicationContext.
BeanFactory загружает бины в контейнер только по запросу, а ApplicationContext при создании контейнера.
BeanFactory поддерживет только Singleton и Prototype скоупы бинов. ApplicationContext поддерживет все существующие скоупы бинов.
BeanFactory не поддерживает автоматическое регистрирование BeanFactoryPostProcessor, BeanPostProcessor, AOP и транзакций. Для тго, чтобы эти фишки заработали, необходимо написать несколько строк кода явно.
Итого: рекомендуется использовать BeanFactory только, если потребление памяти крайне критично

что такое bean?
что такое ?

вопрос:
spring container life cycle?
ответ:
TODO

вопрос:
bean life cycle?
ответ:
Для того, чтобы бин был инициализирован, необходимо выполнить некоторыые шаги для его создания, а когда он уже не нужен, необходимо выполнить шаги по удалению его из IoC контейнера.
Если в java с жизненным циклом экзампляра все просто: при помощи оператора new создается новый экзампляр, а когда он больше не нужен, то ссылка зануляется, мусор чистится и экзампляр попадает на битовые небеса, то со Spring все немного сложнее:
1) контейнер создает экземпляр компонента;
2) Spring внедряет значения и ссылки на компоненты в свойства данного компонента;
3) если компонент реализует BeanNameAware, Spring передает ID компонента методу setBeanName();
4) если компонент реализует BeanFactoryAware, Spring передает ссылку на фабрику методу setBeanFactory();
5) если компонент реализует ApplicationContextAware, Spring передает ссылку на контекст методу setApplicationContext();
6) если какие-нибудь из компонентов реализуют интерфейс BeanPostProcessor, то вызываются их методы postProcessBeforeInitialization();
7) если какие-нибудь из компонентов реализуют интерфейс InitializatingBean, то вызываются их методы afterPropertiesSet() или методы указанные в атрибуте init-method;
8) если какие-нибудь из компонентов реализуют интерфейс BeanPostProcessor, то вызываются их методы postProcessAfterInitialization();
9) в этот момент компонент готов к использованию и находится в контейнере Spring до его уничтожения;
10) если какие-нибудь из компонентов реализуют интерфейс DisposableBean, то вызываются их методы destroy() или методы указанные в атрибуте destroy-method;

вопрос:
спринг transactional propagation. что это? как работают?
ответ:
1) REQUIRED - указывается по умолчанию. Если указан данный тип propagation, тогда при отсуствии транзакции будет создана новая, в противном случае бизнес логика присоединяется к текущей транзакции;
2) SUPPORTS - если указан данный тип, тогда при наличии транзакции данная бизнес логика присоединится к текущей транзакции, в противном случае бизнес логика будет выполнена вне транзакции;
3) MANDATORY - если указан данный тип, тогда при наличии транзакции данная бизнес логика присоединится к текущей транзакции, в противном случае будет выброшено исключение;
4) NEVER - spring выбрасывает исключение, если существует текущая транзакция;
5) NOT_SUPPORTED - spring приостанавливает текущую транзакцию и выполняет бизнес логику вне транзакции;
6) REQUIRES_NEW - spring приостанавливает текущую транзакцию и запускает новую;
7) NESTED - если есть активная транзакция, то spring создает check point, и если новая транзакция выбрасывает исключение, то откатываемся до check point, в противном случае работает, как REQUIRED.

вопрос:
что такое двухфазные транзакции?
ответ:

Алгоритмы
Пузырьковая сортировка - вид сортировки, в которой мы сравниваем 2 ближайщих элемента. Если первый элемент больше второго, то меняем их местами. Если хотя бы одна перестановка была за итерацию, тогда повторяем проход до того момента пока в итерации не будет изменений.



Bts Digital:

Java:
+Spring жизненный цикл
+Как создаётся бин
+Все о стримах Java

Java memory model

Kotlin:
+ Отличия Val от const
  Корутины

SQL:
Способы хранения данных (на основе hash или чего-то другого)
+Having


KazDream:

+ Экранирование string
+ String pool

+ В метод передаётся массив цифр с дубликатами, и цифра. Найти индексы расположения цифр.

+ В метод передаётся массив строк и строка. Нужно найти все совпадения.
+ То есть, если передаётся abc и в массиве найдётся bca, то это считается. Найти совпадения

Многопоточность
+ Acid
+ Принципы изоляции транзакций
  Sql базовые вопросы на собеседование

HashMap почему initialCapacity = 16

Монго базовые знания

+ Отличия git pull от git fetch

+ Паттерн адаптер против прокси
+ Паттерн state и strategy

KazDream2:
state machine что это
gRPC
hateoas
oauth2
sql join в постгрес
как мигрировать данные из одной базы данных в другую

Рекомендует укрепить:  
1. Необходимо изучить spring security,
2. возможно углубиться в сторону баз данных
3. Doсker
4. Kafka
5. Elasticsearch
6. State Machine

Infin IT Solutions

interface private methods
interface static methods


Novardis

* что такое rest
* каким принципам нужно следовать, чтобы построить правильное rest api
* различия noSQL и SQL? когда какую стоит выбрать?
* репликация бд, шадринг, сегментация
* для чего нужен having, group by

TODO послушать запись

Sigma software (Украина)
* отличия comparable от comparator
* SOLID на практике
* optimistic lock vs pissimistic lock
* microservices (orcestration, chareography, saga)


Superchat
* Какой самостоятельный проект вы реализовывали

AUTO1
deference between synchronized hashmap and concurrenthashmap
blue green deployment
canary deployment

optimistic vs pessimistic lock