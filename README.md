OOP
Проблемы в проектировании

1. **Статический подход к определению возможных действий:**
   В текущей реализации метод `performAction` в классе `Main` жестко связан с конкретными интерфейсами, что делает код менее гибким при добавлении новых типов действий или животных.

2. **Отсутствие универсальности в методе `move` в классе `Animal`:**
   Метод `move` просто выводит сообщение о движении, что может быть недостаточно универсальным для всех животных. Возможно, следует предоставить более конкретные методы для различных типов движений.

3. **Возможные проблемы совместимости при добавлении новых типов животных:**
   При добавлении новых типов животных потребуется вносить изменения в существующий код, что может привести к проблемам совместимости.

## Вопросы по выполнению задания

1. **Использование интерфейсов или абстрактных классов:**
   Возникал вопрос о том, стоит ли использовать интерфейсы или абстрактные классы для более гибкой структуры. В данном случае использовалось наследование для простоты.

2. **Метод `performAction` и проверка типов:**
   Как более эффективно реализовать метод `performAction`, чтобы избежать жесткой проверки типов и сделать его более расширяемым?

3. **Более универсальный метод `move`:**
   Как сделать метод `move` в классе `Animal` более универсальным, чтобы он мог обрабатывать различные типы движений?

4. **Вопросы о структуре проекта:**
   Возникали вопросы о том, как лучше организовать структуру проекта, чтобы обеспечить чистоту кода и удобство расширения.

Мы призываем к обсуждению и предложениям по улучшению данного проекта.
