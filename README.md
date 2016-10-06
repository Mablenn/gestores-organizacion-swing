<h2>FLOWLAYOUT:</h2>
<p>Distribuye los componentes de izquierda a derecha y de arriba a abajo seg�n su tama�o y alineando al centro el contenido, si no se indica lo contrario en el constructor.</p>
<p>Constructores:</p>
<h3>FlowLayout()</h3>
<p>	panel.setLayout(new FlowLayout());</p>	
<h3>FlowLayout(int alineacion);</h3>
<p>El valor de la alineaci�n puede ser LEFT, RIGHT o CENTER.</p>
<p>panel.setLayout(new FlowLayout(FlowLayout.LEFT));</p>
<h3>FlowLayout(int alineacion, int sH, int sV);</h3>
<p>Adem�s de la alineaci�n, permite la separaci�n horizontal y vertical entre componentes.</p>
<p>panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));</p>

