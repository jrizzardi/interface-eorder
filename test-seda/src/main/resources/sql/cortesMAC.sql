SELECT c.nro_servicio, c.numero_cliente, c.sucursal, trim(s.nombre) nombre,
       trim(s.nom_calle) || ' ' || trim(s.nro_dir) AS direccion,
       c.sector, c.zona, c.tarifa
  FROM servicio_cab c JOIN servicio_corte s ON (c.nro_servicio = s.nro_servicio)
  WHERE c.estado_transmision = 'T'
    AND c.id_servicio = 1
  ORDER BY c.nro_servicio DESC
