(ns org.httpkit.encode
  (:import [java.util Base64]))

(defmacro base64-encode [bs]
  `(.encodeToString (Base64/getEncoder) ~bs))
