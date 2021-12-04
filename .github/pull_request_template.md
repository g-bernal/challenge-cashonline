### ¿Por qué es necesario este cambio?
<!--
- Descripción breve que incluya detalles sobre el cambio que se desea realizar
-->

### Tipo de cambio
- [ ] New feature
- [ ] New Tests
- [ ] Hot fix
- [ ] Bug fix
- [ ] Refactor
- [ ] New Release (tag cut, forward merge)

### Impacto del cambio
<!-- 
- Descripción breve de lo que se cambió y su impacto a nivel funcional y/o no-funcional
-->

### Checklist

- [ ] Se corrió un ```mvn clean install``` y todos los test terminaron exitosamente.
- [ ] Fueron agregados los tests necesarios para obtener al menos un coverage del 70% de las clases modificadas.
- [ ] No existen variables y/o imports sin utilizar en las clases modificadas.
- [ ] No hay imports en las clases modificados anotados con asterisco. Ej: ```com.somepackage.*```
- [ ] Se utilizó ```Slf4j``` para el log de la aplicación y no ```System.out```.
- [ ] Los métodos están correctamente encapsulados, con los modificadores de acceso ```private```, ```package-private```, ```protected``` y ```public```.
- [ ] Se retorna ```java.util.Optional<T>``` en métodos que puedan devolver objetos nulos.
- [ ] Los métodos public están documentados con ```javadoc```.