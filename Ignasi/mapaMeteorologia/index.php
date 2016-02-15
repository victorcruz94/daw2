<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
    <title>Ejercicio 23 - Google Maps</title>
    <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;hl=es&amp;key=ABQIAAAA30JtKUU8se-7KKPRGSfCMBT2yXp_ZAY8_ufC3CFXhHIE1NvwkxRZNdns2BwZvEY-V68DvlyUYwi1-Q" type="text/javascript"></script>
    <script type="text/javascript">
      var map = null;
      var mgr = null;
      var myLat = 41.5122217;
      var myLng = 1.2673331;
      var myZoom = 8;
      var puntos = {};
      var peticion = null;
      var marcadores = [];

      function inicializa_xhr() {
        if(window.XMLHttpRequest) {
          return new XMLHttpRequest();
        } else if (window.ActiveXObject) {
          return new ActiveXObject("Microsoft.XMLHTTP");
        }
      }

      function load() {
        if(GBrowserIsCompatible()) {
          map = new google.maps.Map(document.getElementById('map'), {
          center: {lat: myLat, lng: myLng},
          zoom: myZoom
        });
        cargaPrediccion();
        setInterval(cargaPrediccion, 3000);
        //cargaPrediccion();
        }
      }

      function cargaPrediccion() {
        peticion = inicializa_xhr();
        peticion.onreadystatechange = muestraPrediccion;
        peticion.open('GET', 'http://localhost/ejemplos/mapas/previsionMeteorologica.php?nocache='+Math.random(), true);
        peticion.send(null);
      }

      function muestraPrediccion() {
        if(peticion.readyState == 4) {
          if(peticion.status == 200) {
            puntos = eval("("+peticion.responseText+")");
            if(marcadores.length==0){
              for(var i=0;i<puntos.length;i++){
                var marker = new google.maps.Marker({
                  position: {lat: puntos[i].latlon[0], lng: puntos[i].latlon[1]},
                  map: map,
                  icon: "imagenes/" + puntos[i].prediccion + ".png"
                });
                marcadores[i]=marker;
              }
            }else{
              for(var j=0;j<marcadores.length;j++){
                marcadores[j].setMap(null);
              }
              for(var i=0;i<puntos.length;i++){
                var marker = new google.maps.Marker({
                  position: {lat: puntos[i].latlon[0], lng: puntos[i].latlon[1]},
                  map: map,
                  icon: "imagenes/" + puntos[i].prediccion + ".png"
                });
                marcadores[i]=marker;
              }
            }
            //map.clearOverlays();
            //mgr = new GMarkerManager(map);
            //mgr.addMarkers(getMarcadores(), 3);
            //mgr.refresh();
          }
        }
      }

      /*function getMarcadores() {
        var marcadores = [];
        for (var i=0; i<puntos.length; ++i) {
          var marker = new google.maps.Marker({
            position: getPunto(i),
            map: map,
            icon: getIcono(i)
          });
          marcadores.push(marker);
        }
        return marcadores;
      }*/

      /*function getPunto(i) {
        var punto = puntos[i];
        var lat = punto.latlon[0];
        var lon = punto.latlon[1];
        return new GLatLng(lat, lon);
      }*/

      /*function getIcono(i) {
        var punto = puntos[i];
        var icono = new GIcon();
        icono.image = "imagenes/" + punto.prediccion + ".png";
        icono.iconAnchor = new GPoint(16, 16);
        icono.iconSize = new GSize(32, 32);
        return icono;
      }*/
    </script>
    <script async defer
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCL3DFuolKEcaT4Ekajh-Ake2W167GxMmY&callback=initMap">
    </script>
  </head>
  <body onload="load()" onunload="GUnload()">
    <div id="map" style="width: 600px; height: 600px"></div>
  </body>
</html>