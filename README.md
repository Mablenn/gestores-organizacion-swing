<h1>Gestores de organizaci�n (layout manager)</h1>
<h2>FLOW LAYOUT:</h2>
<p>Distribuye los componentes de izquierda a derecha y de arriba a abajo seg�n su tama�o y alineando al centro el contenido, si no se indica lo contrario en el constructor.</p>
<p>Constructores:</p>
<h3>FlowLayout()</h3>
<p>JPanel panel = new JPanel();</p>
<p>	panel.setLayout(new FlowLayout());</p>	
<h3>FlowLayout(int alineacion);</h3>
<p>El valor de la alineaci�n puede ser LEFT, RIGHT o CENTER.</p>
<p>JPanel panel = new JPanel();</p>
<p>panel.setLayout(new FlowLayout(FlowLayout.LEFT));</p>
<h3>FlowLayout(int alineacion, int sH, int sV);</h3>
<p>Adem�s de la alineaci�n, permite la separaci�n horizontal y vertical entre componentes.</p>
<p>JPanel panel = new JPanel();</p>
<p>panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));</p>
<hr>

<h2>GRID LAYOUT:</h2>
<p>Distribuye los componentes en forma de table en el contenedor, compuesta por columnas y filas. Los componentes se van distribuyendo desde la primera celda en la parte superior izquierda y se van posicionando fila a fila hasta la celda m�s a la derecha de la �ltima fila.</p>
<p>Constructores:</p>
<h3>GridLayout()</h3>
<p>Los controles se posicionar�n en una sola fila.</p>
<p>JPanel panel = new JPanel();</p>
<p>	panel.setLayout(new GridLayout());</p>	
<h3>GridLayout(int nFilas, int nColumnas);</h3>
<p>Los controles se posicionar�n seg�n el n�mero de filas y columnas indicado.</p>
<p>JPanel panel = new JPanel();</p>
<p>panel.setLayout(new GridLayout(2,5));</p>
<h3>GridLayout(int nFilas, int nColumnas, int sHor, sVert);</h3>
<p>Adem�s del n�mero de filas y columnas, permite la separaci�n horizontal y vertical entre componentes.</p>
<p>JPanel panel = new JPanel();</p>
<p>panel.setLayout(new GridLayout(2, 5, 5, 10));</p>
<hr>

<h2>BORDER LAYOUT:</h2>
<p>Este gestor de organizaci�n permite colocar componentes alrededor de los bordes de un contenedor. Los bordes son NORTH, SOUTH, EAST, WEAST, CENTER. Es decir, el contenedor es dividido en cinco zonas.</p>
<p>En este tipo de gestor es necesario especificar la zona donde ubicamos el componente cuando se a�ada al contenedor.</p>
<p>Constructores:</p>
<h3>BorderLayout()</h3>
<p>JPanel panel = new JPanel();</p>
<p>panel.setLayout(BorderLayout());</p>
<h3>BorderLayout(int sHor, sVert)</h3>
<p>Permite crear espacios de separaci�n entre los controles con los valores indicados.</p>
<p>JPanel panel = new JPanel();</p>
<p>panel.setLayout(BorderLayout(3,8));</p>
<p>Para especificar la zona de ubicaci�n del control:</p>
<p>panel.add(new JButton("Boton1"), BorderLayout.NORTH);</p>
<p>panel.add(new JButton("Boton2"), BorderLayout.SOUTH);</p>
<p>panel.add(new JButton("Boton3"), BorderLayout.EAST);</p>
<p>panel.add(new JButton("Boton4"), BorderLayout.WEAST);</p>
<p>panel.add(new JButton("Boton5"), BorderLayout.CENTER);</p>
<hr>

<h2>BOX LAYOUT:</h2>
<p>Este layout manager no est� en la libreria java.awt, sino que se encuentra dentro de la librer�a javax.swing. Utilizando este layout podemos colocar los componentes en posici�n vertical, uno encima de otro, o en posici�n horizontal, uno a continuaci�n de otro, indicando el eje deseado. Puede servir para mostrar toda una fila o columna de un tipo de componente, por ejemplo un panel dentro de un contenedor que contenga una fila de botones en vertical.</p>
<p>El paquete javax.swing incluye un tipo de contenedor llamado Box con el que se pueden controlar los componentes insertados en �l. La clase Box posee varios m�todos est�ticos con los que se puede controlar el posicionamiento de los componentes que forma el contenedor.</p>
<p>De este modo se puede utilizar el gestor BoxLayout de varias formas. Asignando el tipo de gestor de administraci�n al contenedor principal, a trav�s del m�todo .setLayout(), o creando un objeto Box y utilizando sus m�todos est�ticos para el posicionamiento de los elementos.</p>
<p><strong>A trav�s de un objeto Box:</strong></p>
<p>Box contenedorHorizontal = Box.createHorizontalBox();</p>
<p>Box contenedorVertical = Box.createVerticalBox();</p>
<p>//A�adir controles a cada uno de los contenedores</p>
<p>	contenedorHorizontal.add(new JButton("Boton 1");</p>
<p>	contenedorHorizontal.add(new JButton("Boton 2");</p>
<p>	contenedorVertical.add(new Label("Etiqueta 1");</p>
<p>	contenedorVertical.add(new Label("Etiqueta 2");</p>
<p>//A�adir los Box al contenedor principal</p>
<p>ventanaPrincipal.getContentPane().add(contenedorHorizontal);</p>
<p>ventanaPrincipal.getContentPane().add(contenedorVertical);</p>
<p><strong>Asignando el tipo de layout al contenedor principal:</strong></p>
<p>Constructor:</p>
<h3>BoxLayout(Container contenedor, int eje)</h3>
<p>El primer par�metro que recibe el constructor es el contenedor donde se ubicar� el control.</p>
<p>El segundo par�metro ser� el eje, vertical u horizontal.</p>
<p>JPanel panel = new JPanel();</p>
<p>panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS);</p>
<p>panel.add(new JButton("Boton1")</p>
<p>panel.add(new JButton("Boton2")</p>
<p>panel.add(new JButton("Boton3")</p>
<p>panel.add(new JButton("Boton4")</p>
<p>panel.add(new JButton("Boton5")</p>





