
FLOWLAYOUT:
Distribuye los componentes de izquierda a derecha y de arriba a abajo seg�n su tama�o y alineando al centro el contenido, si no se indica lo contrario en el constructor.

Constructores:
FlowLayout();
Uso:
	panel.setLayout(new FlowLayout());
FlowLayout(int alineacion); -->El valor de la alineaci�n puede ser LEFT, RIGHT o CENTER.
Uso:
	panel.setLayout(new FlowLayout(FlowLayout.LEFT));
FlowLayout(int alineacion, int sH, int sV); --> Adem�s del centrado, permite la separaci�n horizontal y vertical entre componentes.
Uso:
	panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
