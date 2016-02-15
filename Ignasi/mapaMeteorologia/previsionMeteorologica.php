<?php
  $condicionesMetereologicas = array("lluvia", "soleado", "nublado", "tormentas", "nieve");

  $puntosGeograficos = array(
    array(41.3948976, 2.0787275),
    array(41.6184012, 0.5849153),
    array(42.0723997, 1.967945),
    array(41.1258642, 1.2035541)
  );

  // Determinar las condiciones metereologicas de cada punto
  $coordenadasGeograficas = array();
  for($i=0; $i<count($puntosGeograficos); $i++) {
    $numeroAleatorio = rand(0, count($condicionesMetereologicas)-1);
    $coordenadasGeograficas[] = array(
      'latlon' => $puntosGeograficos[$i],
      'prediccion' => $condicionesMetereologicas[$numeroAleatorio]
    );
  }

  // Enviar la prediccion en formato JSON
  /*
  [
  { latlon: [42.779275360241904, -2.63671875], prediccion: "lluvia" },
  ...
  ]
  */
  $codigo_json = "[ \n";
  foreach($coordenadasGeograficas as $informacion) {
    $codigo_json .= "{ latlon: [" . $informacion["latlon"][0] . ", " . $informacion["latlon"][1] . "], prediccion: \"" . $informacion["prediccion"] . "\" }, \n";
  }
  $codigo_json .= "]";

  echo $codigo_json;
?>