
<h1>CodExpress — Nivel Intermedio (Estructuras de Datos y POO inicial)</h1>
<p><strong>Tiempo total:</strong> 3 horas · <strong>Objetivo:</strong> completar <u>7 u 8 mini-retos</u> y, si te alcanza, una <u>app integrada (código 2900)</u> que reutilice tu propio código.</p>

<h2>Flujo de trabajo (fork &amp; PR)</h2>
<ol>
  <li>Haz <em>fork</em> de este repo y clónalo.</li>
  <li>Usa un <strong>&lt;ALIAS&gt;</strong> sin espacios ni acentos (tu usuario de GitHub o <code>nombre-apellido</code> en minúsculas).</li>
  <li>Para cada mini-reto crea un archivo con <strong>este formato exacto</strong>: <code>&lt;CODIGO_RETO&gt;_&lt;ALIAS&gt;_v&lt;N&gt;.&lt;ext&gt;</code> (ej.: <code>2004_maria-perez_v1.py</code>).</li>
  <li>Si construyes la app integrada, crea la carpeta <code>2900_&lt;ALIAS&gt;_app/</code> con <code>README.md</code> (cómo ejecutar), y si quieres <code>requirements.txt</code> y <code>src/</code>.</li>
  <li>Abre un Pull Request a <code>main</code> con título: <strong>&lt;ALIAS&gt; — Entrega Nivel Intermedio</strong>.</li>
</ol>

<hr />

<h2>Códigos (Nivel Intermedio)</h2>
<ul>
  <li><strong>Mini-retos:</strong> 2001–2008 (elige 7 u 8).</li>
  <li><strong>App integrada:</strong> 2900 (<em>Organizer 1.0</em>).</li>
</ul>
<p><strong>Nombre de archivo obligatorio:</strong> <code>&lt;CODIGO_RETO&gt;_&lt;ALIAS&gt;_v&lt;N&gt;.&lt;ext&gt;</code></p>

<hr />

<h2>Mini-retos (entrega 7 u 8)</h2>
<p>Usa <strong>solo la librería estándar de Python</strong>. Al final de cada archivo agrega, en comentarios, <strong>3 pruebas</strong> (entrada → salida esperada). La salida se compara <strong>literalmente</strong> (cuida espacios y saltos de línea). Cuando se pida una estructura específica, <u>debes usarla</u>.</p>

<table>
  <thead>
    <tr>
      <th>Código</th>
      <th>Nombre</th>
      <th>Qué se espera (detalles clave)</th>
      <th>Entrada / Salida mínima</th>
      <th>Archivo</th>
      <th>Docs útiles</th>
    </tr>
  </thead>
  <tbody>
    <tr><td><strong>2001</strong></td><td>Agenda de contactos (CRUD)</td><td>Administra contactos con <em>lista de dicts o clase</em> (nombre, apellido, email, teléfono). <u>Búsqueda</u> insensible a mayúsculas por nombre o email; <u>orden</u> estable por apellido, luego nombre. Comandos por stdin: <code>ADD nombre;apellido;email;tel</code>, <code>DEL email</code>, <code>FIND texto</code>, <code>LIST</code>. Emails duplicados → <code>ERROR:DUP</code>.</td><td>Varias líneas de comandos; salida de <code>LIST</code> una por contacto como <code>apellido,nombre &lt;email&gt; tel</code>.</td><td><code>2001_&lt;ALIAS&gt;_v1.py</code></td><td><a href="https://docs.python.org/3/tutorial/datastructures.html">listas/dicts</a> · <a href="https://docs.python.org/3/library/stdtypes.html#string-methods">strings</a></td></tr>
    <tr><td><strong>2002</strong></td><td>Agenda académica</td><td>Registra materias con <code>nombre;creditos;nota</code>. Calcula <u>promedio ponderado</u> (Decimal, 2 decimales, ROUND_HALF_UP). Rechaza duplicados de materia → <code>ERROR:DUP</code>. Comandos: <code>ADD</code>, <code>AVG</code>, <code>LIST</code>. Ordena <code>LIST</code> por créditos desc, luego nombre.</td><td>Entrada: varias líneas de comandos; salida de <code>AVG</code> como <code>prom=XX.XX</code>.</td><td><code>2002_&lt;ALIAS&gt;_v1.py</code></td><td><a href="https://docs.python.org/3/library/decimal.html">decimal</a> · <a href="https://docs.python.org/3/library/functions.html#sorted">sorted</a></td></tr>
    <tr><td><strong>2003</strong></td><td>Pila (deshacer)</td><td>Implementa clase <code>Stack</code> con <code>push</code>/<code>pop</code>/<code>peek</code>/<code>size</code>. <u>Complejidad O(1)</u> por operación (usa lista con <code>append</code>/<code>pop</code> al final). Vacía en <code>pop</code>/<code>peek</code> → <code>ERROR:EMPTY</code>. Comandos: <code>PUSH x</code>, <code>POP</code>, <code>PEEK</code>, <code>SIZE</code>. Incluye en el docstring una línea con: <code>costos: push(O(1)), pop(O(1)), peek(O(1))</code>.</td><td>Una operación por línea; imprime el resultado de POP/PEEK/SIZE.</td><td><code>2003_&lt;ALIAS&gt;_v1.py</code></td><td><a href="https://docs.python.org/3/tutorial/datastructures.html#more-on-lists">list.pop/append</a> · <a href="https://docs.python.org/3/tutorial/classes.html">clases</a></td></tr>
    <tr><td><strong>2004</strong></td><td>Cola (turnos)</td><td>Implementa cola FIFO con <strong><code>collections.deque</code></strong> (requisito). Comandos: <code>ENQUEUE x</code>, <code>DEQUEUE</code>, <code>FRONT</code>, <code>LENGTH</code>. Vacía en DEQUEUE/FRONT → <code>ERROR:EMPTY</code>. <em>No se acepta</em> <code>list.pop(0)</code> por costo O(n).</td><td>Una operación por línea; imprime el resultado de DEQUEUE/FRONT/LENGTH.</td><td><code>2004_&lt;ALIAS&gt;_v1.py</code></td><td><a href="https://docs.python.org/3/library/collections.html#collections.deque">deque</a></td></tr>
    <tr><td><strong>2005</strong></td><td>Diccionario ES↔EN bidireccional</td><td>Registra pares <code>es:en</code> (minúsculas). Soporta consultas <code>?palabra</code> devolviendo su par en ambas direcciones. Si se intenta reasignar una palabra ya usada en cualquier lado → <code>ERROR:DUP</code>. Comando <code>LIST</code> imprime ordenado por <code>es</code>. Export opcional a JSON con <code>EXPORT</code>.</td><td>Varias líneas; salida de consulta: <code>es=... en=...</code> o <code>NOTFOUND</code>.</td><td><code>2005_&lt;ALIAS&gt;_v1.py</code></td><td><a href="https://docs.python.org/3/library/stdtypes.html#mapping-types-dict">dict</a> · <a href="https://docs.python.org/3/library/json.html">json</a></td></tr>
    <tr><td><strong>2006</strong></td><td>Sopa de letras (matriz 2D)</td><td>Lee una cuadrícula (A-Z) hasta una línea vacía y luego la palabra objetivo. Busca en <u>8 direcciones</u> (H/V/diagonales). Imprime la primera coincidencia en orden de barrido por filas, y coordenadas <u>0-based</u> como <code>fila,col</code> del primer carácter; si no existe: <code>NO</code>.</td><td>Entrada: matriz líneas (sin espacios), línea vacía, palabra. Salida: <code>r,c</code> o <code>NO</code>.</td><td><code>2006_&lt;ALIAS&gt;_v1.py</code></td><td><a href="https://docs.python.org/3/tutorial/controlflow.html#for-statements">for</a> · <a href="https://docs.python.org/3/library/itertools.html">itertools</a></td></tr>
    <tr><td><strong>2007</strong></td><td>Fibonacci: recursivo + memo</td><td>Implementa <u>dos</u> funciones: <code>fib_rec(n)</code> recursiva con <code>@lru_cache</code> y <code>fib_it(n)</code> iterativa. Ambas deben coincidir. Cuenta llamadas de <code>fib_rec</code> y muestra <code>calls=</code>. Límite: <code>0 ≤ n ≤ 45</code>.</td><td>Entrada: <code>n</code>. Salida: <code>rec=... it=... calls=...</code>.</td><td><code>2007_&lt;ALIAS&gt;_v1.py</code></td><td><a href="https://docs.python.org/3/library/functools.html#functools.lru_cache">lru_cache</a></td></tr>
    <tr><td><strong>2008</strong></td><td>Laberinto (BFS)</td><td>Lee un mapa con <code>#</code>=muro, <code>.</code>=libre, <code>S</code>=inicio, <code>E</code>=salida. Usa <strong>BFS</strong> para hallar camino mínimo. Imprime <code>dist=K</code> y una secuencia de movimientos en <u>orden de vecinos fijo</u>: U,D,L,R para hacer la solución determinista. Si no hay camino: <code>NO</code>.</td><td>Entrada: matriz (todas las líneas misma longitud). Salida: <code>dist=K</code> y en la línea siguiente los movimientos; o <code>NO</code>.</td><td><code>2008_&lt;ALIAS&gt;_v1.py</code></td><td><a href="https://docs.python.org/3/library/collections.html#collections.deque">deque</a> · <a href="https://docs.python.org/3/tutorial/datastructures.html">Estructuras</a></td></tr>
  </tbody>
</table>

<h3>Requisitos mínimos por mini-reto</h3>
<ul>
  <li><strong>E/S exacta</strong>: la comparación es literal.</li>
  <li><strong>3 pruebas</strong> (entrada → salida) en comentarios al final del archivo.</li>
  <li><strong>Solo librería estándar</strong> de Python.</li>
  <li><strong>Nomenclatura exacta</strong> del archivo. Nombre incorrecto: −5%.</li>
</ul>

<hr />

<h2>App integrada (2900) — Organizer 1.0</h2>
<table>
  <thead>
    <tr>
      <th>Código</th>
      <th>Debe reutilizar</th>
      <th>Qué agrega</th>
      <th>Entregables</th>
      <th>Puntaje máx.</th>
    </tr>
  </thead>
  <tbody>
    <tr><td><strong>2900</strong></td><td>2001, 2002, 2003, 2004, 2005</td><td>Un <strong>menú en consola</strong> que integra contactos, agenda académica, pila de deshacer (aplica a operaciones CRUD) y cola de turnos. Reuso real de tus clases/funciones. Manejo básico de errores con mensajes consistentes.</td><td>Carpeta <code>2900_&lt;ALIAS&gt;_app/</code> con <code>README.md</code> (cómo correr, qué módulos integra) y, si quieres, <code>src/</code>.</td><td><strong>180</strong></td></tr>
  </tbody>
</table>
<ul>
  <li>Reutiliza tus módulos (importa funciones/clases) o centralízalos en <code>src/</code>.</li>
  <li>Menú simple con opciones numeradas, confirmaciones y opción “deshacer” usando tu <code>Stack</code>.</li>
  <li>La cola de turnos (<code>Queue</code>) debe usar <code>deque</code>.</li>
</ul>

<hr />

<h2>Puntajes — Nivel Intermedio</h2>
<ul>
  <li><strong>Mini-reto (máx. 90 pts)</strong>: funciona (60%) · casos borde / 3 pruebas (20%) · diseño de estructuras / claridad (10%) · defensa breve (10%).</li>
  <li><strong>App 2900 (máx. 180 pts)</strong>: integración (50%) · cohesión/reuso (20%) · manejo de errores (20%) · README (10%).</li>
</ul>

<hr />

<h2>Requisitos de precisión y verificación</h2>
<ul>
  <li><strong>Estructuras específicas obligatorias</strong> cuando se indiquen (p. ej., <code>deque</code> en 2004, lista como pila en 2003).</li>
  <li><strong>Orden y formato deterministas</strong> (p. ej., coordenadas 0-based en 2006, vecinos U,D,L,R en 2008).</li>
  <li><strong>Redondeo con <code>decimal</code></strong> cuando aplique (2002).</li>
  <li><strong>Comandos por stdin</strong> con gramática exacta (2001, 2002, 2003, 2004, 2005).</li>
</ul>
<p>Durante la revisión se puede pedir una <strong>edición en vivo de 2 minutos</strong> (ajustar un formato, añadir un caso borde o modificar la estructura). Si reusaste y entendiste tu código, será rápido.</p>

<hr />

<h2>Checklist final</h2>
<ul>
  <li>7 u 8 mini-retos con nombres correctos: <code>200x_&lt;ALIAS&gt;_vN.py</code>.</li>
  <li>3 pruebas en comentarios por archivo.</li>
  <li>Si hiciste la app: carpeta <code>2900_&lt;ALIAS&gt;_app/</code> + <code>README.md</code> + menú funcional.</li>
  <li>Pull Request: <code>&lt;ALIAS&gt; — Entrega Nivel Intermedio</code>.</li>
</ul>

<h2>Documentación de Python</h2>
<p><a href="https://docs.python.org/3/">Guía oficial</a> · <a href="https://docs.python.org/3/tutorial/datastructures.html">Estructuras de datos</a> · <a href="https://docs.python.org/3/library/collections.html#collections.deque">deque</a> · <a href="https://docs.python.org/3/library/decimal.html">decimal</a> · <a href="https://docs.python.org/3/library/json.html">json</a> · <a href="https://docs.python.org/3/library/functools.html#functools.lru_cache">lru_cache</a> · <a href="https://docs.python.org/3/tutorial/classes.html">Clases/POO</a></p>
```
