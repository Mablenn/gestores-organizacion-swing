<h2>FLOWLAYOUT:</h2>
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

