
<h1>FLOWLAYOUT:</h1>
<p>Distribuye los componentes de izquierda a derecha y de arriba a abajo según su tamaño y alineando al centro el contenido, si no se indica lo contrario en el constructor.</p>

Constructores:
FlowLayout();
Uso:
	panel.setLayout(new FlowLayout());
FlowLayout(int alineacion); -->El valor de la alineación puede ser LEFT, RIGHT o CENTER.
Uso:
	panel.setLayout(new FlowLayout(FlowLayout.LEFT));
FlowLayout(int alineacion, int sH, int sV); --> Además del centrado, permite la separación horizontal y vertical entre componentes.
Uso:
	panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
