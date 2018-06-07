SELECT first 2 c.nro_servicio, c.numero_cliente, c.sucursal, c.nombre,
       c.nom_calle || ' ' || c.nro_dir AS direccion,
       c.sector, c.zona, c.tarifa
  FROM servicio_cab c JOIN servicio_corte s ON (c.nro_servicio = s.nro_servicio)
  WHERE c.estado_transmision = 'T'
    AND c.id_servicio = 1
  ORDER BY c.nro_servicio DESC
