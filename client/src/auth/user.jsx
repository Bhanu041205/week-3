import React, { useState, useEffect } from "react";

function Use() {
    let [f, setF] = useState("🍊");
    useEffect(() => {
        if (f == "🍊") {
            setF("🍎");
        } else {
            setF("🍊");
        }
    }, [f]);
    return <h1>fruit : {f}</h1>;
}

export default Use;