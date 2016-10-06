<h2>FLOW LAYOUT:</h2>
<p>Distribuye los componentes de izquierda a derecha y de arriba a abajo según su tamaño y alineando al centro el contenido, si no se indica lo contrario en el constructor.</p>
<p>Constructores:</p>
<h3>FlowLayout()</h3>
<p>	panel.setLayout(new FlowLayout());</p>	
<h3>FlowLayout(int alineacion);</h3>
<p>El valor de la alineación puede ser LEFT, RIGHT o CENTER.</p>
<p>panel.setLayout(new FlowLayout(FlowLayout.LEFT));</p>
<h3>FlowLayout(int alineacion, int sH, int sV);</h3>
<p>Además de la alineación, permite la separación horizontal y vertical entre componentes.</p>
<p>panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));</p>

<h2>GRID LAYOUT:</h2>
<p>Distribuye los componentes en forma de table en el contenedor, compuesta por columnas y filas. Los componentes se van distribuyendo desde la primera celda en la parte superior izquierda y se van posicionando fila a fila hasta la celda más a la derecha de la última fila.</p>
<p>Constructores:</p>
<h3>GridLayout()</h3>
<p>Los controles se posicionarán en una sola fila.</p>
<p>	panel.setLayout(new GridLayout());</p>	
<h3>GridLayout(int nFilas, int nColumnas);</h3>
<p>Los controles se posicionarán según el número de filas y columnas indicado.</p>
<p>panel.setLayout(new GridLayout(2,5));</p>
<h3>GridLayout(int nFilas, int nColumnas, int sHor, sVert);</h3>
<p>Además del número de filas y columnas, permite la separación horizontal y vertical entre componentes.</p>
<p>panel.setLayout(new GridLayout(2, 5, 5, 10));</p>

