<h1 style="text-align:center">Gestores de organizaci�n (layout)</h1>
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
<p>Este layout manager no est� el la libreria java.awt, sino que se encuentra dentro de la librer�a javax.swing.</p>



