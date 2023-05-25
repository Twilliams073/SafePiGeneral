import React,{useEffect, useState} from 'react'
import SensorService from '../services/SensorService'

const ListSensorComponent = () => {

    const [sensors, setSensors] = useState([])

    useEffect(() => {

        SensorService.getAllSensors().then((response) => {
            setSensors(response.data)
            console.log(response.data)
        }).catch(error =>{
            console.log(error);
        })

    }, [])

  return (
    <div className = "container">
        <h2 className = "text-center"> Sensor List </h2>
        <table className = "table table-bordered table-stripped">
            <thead>
                <th> Pi-Sensor Id </th>

                <th> Pi Id </th>
                <th> Sensor Id </th>
                <th> Sensor Status </th>
                <th> Timestamp </th>
            </thead>
            <tbody>
                {
                    sensors.map(
                        sensor =>
                        <tr key = {sensor.id} >
                            <td> {sensor.id} </td>
                            <td> {sensor.piId} </td>
                            <td> {sensor.sensorId} </td>
                            <td> {sensor.status} </td>
                            <td> {sensor.timestamp} </td>
                        </tr>
                    )
                }
            </tbody>
        </table>
    </div>
  )
}

export default ListSensorComponent