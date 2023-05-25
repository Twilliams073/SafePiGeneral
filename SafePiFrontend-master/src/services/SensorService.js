import axios from 'axios'

const SENSOR_BASE_REST_API_URL = 'http://localhost:8080/api/v1/sensors';

class SensorService{

    getAllSensors(){
        return axios.get(SENSOR_BASE_REST_API_URL)
    }

}

export default new SensorService();