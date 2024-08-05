import { registerPlugin } from '@capacitor/core'

export interface DeviceIdPlugin {
  getId(): Promise<{ id: string }>
}

const DeviceId = registerPlugin<DeviceIdPlugin>('DeviceId')

export default DeviceId
