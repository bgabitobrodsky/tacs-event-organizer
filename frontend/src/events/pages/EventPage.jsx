import { useEffect } from "react";
import { useEventsStore } from "../../hooks"
import { useParams } from "react-router-dom";
import { Navbar } from "../components/Navbar";
import { Event } from "../components/Event";

export const EventPage = () => {

    const { currentEvent } = useEventsStore();
    const { eventId } = useParams();

    useEffect(() => {
        
        if(!currentEvent){
            //load event by id in params
        }
    
        return () => {
            
        }
    }, [])
    

    return (
        <>
            <Navbar />
            <div className="container" style={{marginTop:'70px'}}>
                <div className="row">
                    <div className="col"></div>
                    <div className="col-12 col-md-8">
                        <Event event={ currentEvent } />
                    </div>
                    <div className="col"></div>
                </div>
            </div>
            
        </>
    )
}
